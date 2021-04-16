package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.ErrorHtmlUsingHEADP;
import com.ibm.account.model.ErrorHtmlUsingHEADResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingHEADI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ErrorHtmlUsingHEADImpl implements ErrorHtmlUsingHEADI {
 
    private static final Log logger = LogFactory.getLog(ErrorHtmlUsingHEADImpl.class);
   
    public ErrorHtmlUsingHEADResponseWrapper reliable(ErrorHtmlUsingHEADP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ErrorHtmlUsingHEADResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ErrorHtmlUsingHEADResponseWrapper execute(ErrorHtmlUsingHEADP requestParams){
        //TODO
        return new ErrorHtmlUsingHEADResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
