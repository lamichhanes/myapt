package com.storage.unit.controllers;

import com.storage.unit.models.customer.CustomerInfo;
import com.storage.unit.service.customer.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerInfoService customerInfoService;

    @PostMapping(value = "/customers/save/customer", produces = "application/json")
    public ResponseEntity<CustomerInfo> postCustomerInfo  (@RequestBody CustomerInfo customerInfo) {
//        CustomerInfo entity = new CustomerInfo.CustomerInfoBuilder(customerInfo.getEmail())
//                .firstName(customerInfo.getFirstName())
//                .lastName(customerInfo.getLastName())
//                .phoneNumber(customerInfo.getPhoneNumber()).build();
        try {
            customerInfoService.saveCustomer(customerInfo);
        } catch ( Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(customerInfo, HttpStatus.OK);
    }
}
