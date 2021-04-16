package com.ibm.account.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ibm.account.model.String;

@Repository
public interface StringRepo extends MongoRepository<String,String>{

}
