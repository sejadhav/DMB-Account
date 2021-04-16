#!/bin/bash

# ********************************************************************************************************************

# Licensed materials - Property of IBM 

# 6949-63D 

# Developed by Digital Integration Practice 

# (C) Copyright IBM Corp. 2016 All Rights Reserved. 

#  

# US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract

# with IBM Corp. 

# 

# This asset is provided ``as is'' and any expressed or implied warranties, including, but not limited to, the 

# implied warranties and fitness for a # particular purpose are disclaimed. in no event shall IBM be liable for 

# any direct, indirect, incidental, special, exemplary, or consequential damages.

# ********************************************************************************************************************

#grafana_url=$1
#grafana_api_key=$2
#postgrafana=$3
#title_name=$4

 error_exit3() { 


 if [ $? -ne 0 ]; then
 
  echo "Something went wrong while enabling grafana."

  exit 1

 fi

}

	echo $1
	echo $2
	echo -e "${CYAN}Provisioning Grafana dashboard at ${YELLOW}$1/api/dashboards/db${CYAN}...${NC}"
	
#search variable will give us all the dashboards.......................
	
       search=`curl -X   GET -H  "Authorization:Bearer $2" $1/api/search?folderIds=0&query=&starred=false |jq . `
        
#searchvalue will have all the title name.....................................
       {
       searchvalue=`echo $search  | jq '.[] .title'`  
       }||
       {
       echo " Invalid API Key"
       exit 1
       }
       
# checking title name exist in dashboard or not ..............."if exist then update the dashboard otherwise create a new dashboard"
       
       if [ "$3" == "true" ]; then
	
	if echo "$searchvalue" | grep -q "$4"; then
         echo "Updating The Existing One ";
	 statusOfExistingOne=`curl -X POST $1/api/dashboards/db -s -d @./devops/monitoring/grafanadashboard.json --header "Authorization: Bearer $2"  --header 'cache-control: no-cache' --header 'content-type: application/json' --write-out %{http_code}`
         statusCode=`echo $statusOfExistingOne | cut -d'}' -f2`
         else
	 echo "Creating New Api Dashboard"
        statusOfNewOne=`curl -X POST $1/api/dashboards/db -s -d @./devops/monitoring/grafanadashboard.json --header "Authorization: Bearer $2"  --header 'cache-control: no-cache' --header 'content-type: application/json' --write-out %{http_code}`
	statusCode=`echo $statusOfNewOne | cut -d'}' -f2`
         fi
	 else 
	 echo "Developer Dont Want to Update/Create Grafana Dashboard"
	 fi
	

	if [ "$statusCode" == "200" ]; then	

		echo -e "${GREEN}Grafana dashboard provisioned successfully.${NC}"
	elif [ "$3" == "false" ]; then
                 echo "If You Want to Update Please Change grafanaDashboardUpdate Parameter to true"

	else
                
		statusMessage=`echo $status | cut -d'}' -f1 | cut -d',' -f1 | cut -d':' -f2`

		echo -e "${RED}Something went wrong while enabling grafana. Server reported error ${GREEN}$statusMessage${RED}.${NC}"

		# capturing the stage of generate_graphana

		write_logFile "failover.grafana.enabled" "true"

  		exit 1

	fi





