package com.ibm.account.exception;

import java.util.HashMap;
import java.util.Map;

import com.ibm.account.exception.ApiExceptionResponse;
import com.ibm.account.exception.ErrorStatusCode;
import com.ibm.account.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Not Found"));
		 
		 apiExceptions.put("getAccountsUsingGET",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Not Found"));
		 
		 apiExceptions.put("getAccountUsingGET",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Not Found"));
		 
		 apiExceptions.put("errorHtmlUsingGET",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Not Found"));
		 
		 apiExceptions.put("errorHtmlUsingPUT",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Not Found"));
		 
		 apiExceptions.put("errorHtmlUsingPOST",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(204),ApiExceptionResponse.getInstance(204,Void.class,"No Content"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 
		 apiExceptions.put("errorHtmlUsingDELETE",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(204),ApiExceptionResponse.getInstance(204,Void.class,"No Content"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 
		 apiExceptions.put("errorHtmlUsingPATCH",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(204),ApiExceptionResponse.getInstance(204,Void.class,"No Content"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 
		 apiExceptions.put("errorHtmlUsingHEAD",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(204),ApiExceptionResponse.getInstance(204,Void.class,"No Content"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 
		 apiExceptions.put("errorHtmlUsingOPTIONS",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Not Found"));
		 
		 apiExceptions.put("getMessageUsingGET",responses);
		 
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
