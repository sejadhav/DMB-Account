package com.ibm.account.services.impl;
 
import java.util.*;
 
import com.ibm.account.model.ErrorHtmlUsingPATCHP;
import com.ibm.account.model.ErrorHtmlUsingPATCHResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingPATCHI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ErrorHtmlUsingPATCHImpl implements ErrorHtmlUsingPATCHI {
 
    private static final Log logger = LogFactory.getLog(ErrorHtmlUsingPATCHImpl.class);
   
    public ErrorHtmlUsingPATCHResponseWrapper reliable(ErrorHtmlUsingPATCHP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ErrorHtmlUsingPATCHResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ErrorHtmlUsingPATCHResponseWrapper execute(ErrorHtmlUsingPATCHP requestParams){
        //TODO
        return new ErrorHtmlUsingPATCHResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
