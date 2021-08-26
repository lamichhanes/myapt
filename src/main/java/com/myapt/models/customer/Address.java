package com.myapt.models.customer;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity(name="customer_info_address")
public @Data class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long addressId;
    @ManyToOne
    @JsonIgnore
    private CustomerInfo customerInfo;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private boolean billingAddress = false;

}
