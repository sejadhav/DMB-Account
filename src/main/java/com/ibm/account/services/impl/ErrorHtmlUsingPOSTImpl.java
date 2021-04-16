package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.ErrorHtmlUsingPOSTP;
import com.ibm.account.model.ErrorHtmlUsingPOSTResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingPOSTI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ErrorHtmlUsingPOSTImpl implements ErrorHtmlUsingPOSTI {
 
    private static final Log logger = LogFactory.getLog(ErrorHtmlUsingPOSTImpl.class);
   
    public ErrorHtmlUsingPOSTResponseWrapper reliable(ErrorHtmlUsingPOSTP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ErrorHtmlUsingPOSTResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ErrorHtmlUsingPOSTResponseWrapper execute(ErrorHtmlUsingPOSTP requestParams){
        //TODO
        return new ErrorHtmlUsingPOSTResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
