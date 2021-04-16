package com.ibm.account.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ibm.account.model.Account;

@Repository
public interface AccountRepo extends MongoRepository<Account,String>{

}
