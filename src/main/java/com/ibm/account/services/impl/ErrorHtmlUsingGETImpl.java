package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.ErrorHtmlUsingGETP;
import com.ibm.account.model.ErrorHtmlUsingGETResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingGETI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ErrorHtmlUsingGETImpl implements ErrorHtmlUsingGETI {
 
    private static final Log logger = LogFactory.getLog(ErrorHtmlUsingGETImpl.class);
   
    public ErrorHtmlUsingGETResponseWrapper reliable(ErrorHtmlUsingGETP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ErrorHtmlUsingGETResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ErrorHtmlUsingGETResponseWrapper execute(ErrorHtmlUsingGETP requestParams){
        //TODO
        return new ErrorHtmlUsingGETResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
