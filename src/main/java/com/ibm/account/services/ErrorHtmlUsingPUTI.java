package com.ibm.account.services;

import com.ibm.account.model.ErrorHtmlUsingPUTP;
import com.ibm.account.model.ErrorHtmlUsingPUTResponseWrapper;

public interface ErrorHtmlUsingPUTI {

    public ErrorHtmlUsingPUTResponseWrapper execute(ErrorHtmlUsingPUTP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
