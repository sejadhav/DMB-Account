package com.ibm.account.services;

import com.ibm.account.model.GetMessageUsingGETP;
import com.ibm.account.model.GetMessageUsingGETResponseWrapper;

public interface GetMessageUsingGETI {

    public GetMessageUsingGETResponseWrapper execute(GetMessageUsingGETP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
