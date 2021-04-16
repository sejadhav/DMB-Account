package com.ibm.account.services;

import com.ibm.account.model.ErrorHtmlUsingPOSTP;
import com.ibm.account.model.ErrorHtmlUsingPOSTResponseWrapper;

public interface ErrorHtmlUsingPOSTI {

    public ErrorHtmlUsingPOSTResponseWrapper execute(ErrorHtmlUsingPOSTP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
