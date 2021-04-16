package com.ibm.account.services;

import com.ibm.account.model.ErrorHtmlUsingOPTIONSP;
import com.ibm.account.model.ErrorHtmlUsingOPTIONSResponseWrapper;

public interface ErrorHtmlUsingOPTIONSI {

    public ErrorHtmlUsingOPTIONSResponseWrapper execute(ErrorHtmlUsingOPTIONSP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
