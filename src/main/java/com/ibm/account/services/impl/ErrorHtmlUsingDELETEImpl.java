package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.ErrorHtmlUsingDELETEP;
import com.ibm.account.model.ErrorHtmlUsingDELETEResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingDELETEI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ErrorHtmlUsingDELETEImpl implements ErrorHtmlUsingDELETEI {
 
    private static final Log logger = LogFactory.getLog(ErrorHtmlUsingDELETEImpl.class);
   
    public ErrorHtmlUsingDELETEResponseWrapper reliable(ErrorHtmlUsingDELETEP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ErrorHtmlUsingDELETEResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ErrorHtmlUsingDELETEResponseWrapper execute(ErrorHtmlUsingDELETEP requestParams){
        //TODO
        return new ErrorHtmlUsingDELETEResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
