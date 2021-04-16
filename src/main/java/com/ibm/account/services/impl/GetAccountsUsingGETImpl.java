package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.GetAccountsUsingGETP;
import com.ibm.account.model.GetAccountsUsingGETResponseWrapper;
import com.ibm.account.services.GetAccountsUsingGETI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class GetAccountsUsingGETImpl implements GetAccountsUsingGETI {
 
    private static final Log logger = LogFactory.getLog(GetAccountsUsingGETImpl.class);
   
    public GetAccountsUsingGETResponseWrapper reliable(GetAccountsUsingGETP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new GetAccountsUsingGETResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public GetAccountsUsingGETResponseWrapper execute(GetAccountsUsingGETP requestParams){
        //TODO
        return new GetAccountsUsingGETResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
