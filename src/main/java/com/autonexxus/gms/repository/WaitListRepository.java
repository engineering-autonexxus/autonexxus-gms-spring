package com.autonexxus.gms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.autonexxus.gms.model.BusinessContact;

public interface WaitListRepository extends MongoRepository<BusinessContact,String> {
    
}
