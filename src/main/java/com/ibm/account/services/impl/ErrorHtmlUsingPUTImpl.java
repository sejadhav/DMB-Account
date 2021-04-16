package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.ErrorHtmlUsingPUTP;
import com.ibm.account.model.ErrorHtmlUsingPUTResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingPUTI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ErrorHtmlUsingPUTImpl implements ErrorHtmlUsingPUTI {
 
    private static final Log logger = LogFactory.getLog(ErrorHtmlUsingPUTImpl.class);
   
    public ErrorHtmlUsingPUTResponseWrapper reliable(ErrorHtmlUsingPUTP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ErrorHtmlUsingPUTResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ErrorHtmlUsingPUTResponseWrapper execute(ErrorHtmlUsingPUTP requestParams){
        //TODO
        return new ErrorHtmlUsingPUTResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
