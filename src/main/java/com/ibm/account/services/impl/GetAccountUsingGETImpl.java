package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.GetAccountUsingGETP;
import com.ibm.account.model.GetAccountUsingGETResponseWrapper;
import com.ibm.account.services.GetAccountUsingGETI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class GetAccountUsingGETImpl implements GetAccountUsingGETI {
 
    private static final Log logger = LogFactory.getLog(GetAccountUsingGETImpl.class);
   
    public GetAccountUsingGETResponseWrapper reliable(GetAccountUsingGETP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new GetAccountUsingGETResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public GetAccountUsingGETResponseWrapper execute(GetAccountUsingGETP requestParams){
        //TODO
        return new GetAccountUsingGETResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
