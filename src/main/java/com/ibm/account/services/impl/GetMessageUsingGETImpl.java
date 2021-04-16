package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.GetMessageUsingGETP;
import com.ibm.account.model.GetMessageUsingGETResponseWrapper;
import com.ibm.account.services.GetMessageUsingGETI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class GetMessageUsingGETImpl implements GetMessageUsingGETI {
 
    private static final Log logger = LogFactory.getLog(GetMessageUsingGETImpl.class);
   
    public GetMessageUsingGETResponseWrapper reliable(GetMessageUsingGETP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new GetMessageUsingGETResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public GetMessageUsingGETResponseWrapper execute(GetMessageUsingGETP requestParams){
        //TODO
        return new GetMessageUsingGETResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
