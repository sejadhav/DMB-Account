package com.ibm.account.model;

import org.springframework.http.ResponseEntity;
import com.ibm.account.model.Account;

public class GetAccountUsingGETP {

    private String accNumber;

    public GetAccountUsingGETP() {

    }

    public GetAccountUsingGETP(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccNumber () {
        return accNumber;
    }

    public void setAccNumber (String accNumber) {
        this.accNumber = accNumber;
    }

}
