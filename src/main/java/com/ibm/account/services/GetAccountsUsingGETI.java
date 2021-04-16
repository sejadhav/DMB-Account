package com.ibm.account.services;

import com.ibm.account.model.GetAccountsUsingGETP;
import com.ibm.account.model.GetAccountsUsingGETResponseWrapper;

public interface GetAccountsUsingGETI {

    public GetAccountsUsingGETResponseWrapper execute(GetAccountsUsingGETP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
