package com.autonexxus.gms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autonexxus.gms.model.BusinessContact;
import com.autonexxus.gms.repository.WaitListRepository;

@CrossOrigin
@RestController
@RequestMapping("/wait-list")
public class GmsController {

    @Autowired
    WaitListRepository repo;

    @PostMapping(value="/business",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postBusinessContact(@RequestBody BusinessContact contact){
        return new ResponseEntity<>(repo.save(contact),HttpStatus.OK);
    }

    
}
