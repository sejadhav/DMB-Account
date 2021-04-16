package com.ibm.account.services;

import com.ibm.account.model.GetAccountUsingGETP;
import com.ibm.account.model.GetAccountUsingGETResponseWrapper;

public interface GetAccountUsingGETI {

    public GetAccountUsingGETResponseWrapper execute(GetAccountUsingGETP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
