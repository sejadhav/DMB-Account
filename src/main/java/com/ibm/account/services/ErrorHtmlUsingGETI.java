package com.ibm.account.services;

import com.ibm.account.model.ErrorHtmlUsingGETP;
import com.ibm.account.model.ErrorHtmlUsingGETResponseWrapper;

public interface ErrorHtmlUsingGETI {

    public ErrorHtmlUsingGETResponseWrapper execute(ErrorHtmlUsingGETP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
