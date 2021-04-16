package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.ErrorHtmlUsingOPTIONSP;
import com.ibm.account.model.ErrorHtmlUsingOPTIONSResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingOPTIONSI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ErrorHtmlUsingOPTIONSImpl implements ErrorHtmlUsingOPTIONSI {
 
    private static final Log logger = LogFactory.getLog(ErrorHtmlUsingOPTIONSImpl.class);
   
    public ErrorHtmlUsingOPTIONSResponseWrapper reliable(ErrorHtmlUsingOPTIONSP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ErrorHtmlUsingOPTIONSResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ErrorHtmlUsingOPTIONSResponseWrapper execute(ErrorHtmlUsingOPTIONSP requestParams){
        //TODO
        return new ErrorHtmlUsingOPTIONSResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
