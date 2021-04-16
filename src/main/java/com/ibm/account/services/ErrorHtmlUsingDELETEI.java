package com.ibm.account.services;

import com.ibm.account.model.ErrorHtmlUsingDELETEP;
import com.ibm.account.model.ErrorHtmlUsingDELETEResponseWrapper;

public interface ErrorHtmlUsingDELETEI {

    public ErrorHtmlUsingDELETEResponseWrapper execute(ErrorHtmlUsingDELETEP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
