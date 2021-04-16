package com.ibm.account.services;

import com.ibm.account.model.ErrorHtmlUsingHEADP;
import com.ibm.account.model.ErrorHtmlUsingHEADResponseWrapper;

public interface ErrorHtmlUsingHEADI {

    public ErrorHtmlUsingHEADResponseWrapper execute(ErrorHtmlUsingHEADP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
