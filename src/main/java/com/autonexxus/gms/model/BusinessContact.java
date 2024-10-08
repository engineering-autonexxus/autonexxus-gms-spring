package com.autonexxus.gms.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "businessContact")
public class BusinessContact {

    @Id
    public String id;
    public String fullName;
    public String businessName;
    public Integer noOfGarages;
    public String city;
    public String email;
    public Long mobileNumber;
    public Date timestamp;

}
