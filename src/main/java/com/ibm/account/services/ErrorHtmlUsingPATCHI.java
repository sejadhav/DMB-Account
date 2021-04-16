package com.ibm.account.services;

import com.ibm.account.model.ErrorHtmlUsingPATCHP;
import com.ibm.account.model.ErrorHtmlUsingPATCHResponseWrapper;

public interface ErrorHtmlUsingPATCHI {

    public ErrorHtmlUsingPATCHResponseWrapper execute(ErrorHtmlUsingPATCHP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
