package com.myapt.controllers;

import com.myapt.models.customer.CustomerInfo;
import com.myapt.util.TrackingUtil;
import com.myapt.service.customer.CustomerInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerInfoService customerInfoService;


    @PostMapping(value = "/customers/customer/save", produces = "application/json")
    public ResponseEntity<CustomerInfo> postCustomerInfo(@RequestBody CustomerInfo customerInfo,
                                                         @RequestParam(name = "request-tracking-id" , required =
                                                                 false) String trackingId) throws Exception {
        trackingId = ( trackingId == null) ? TrackingUtil.generateTrackingId(): trackingId;
        LOGGER.info("Update customer for trackingId : " + trackingId + " received request body -> " + customerInfo.toString());
        customerInfoService.saveCustomer(customerInfo);
        return new ResponseEntity<>(customerInfo, HttpStatus.OK);
    }

    @GetMapping(value = "customers/customer/{id}", produces = "application/json")
    public ResponseEntity<CustomerInfo> getCustomerByCustomerId(@PathVariable(name = "id") Long customerId) {

        CustomerInfo customerInfo = customerInfoService.findCustomerByCustomerId(customerId);
        return new ResponseEntity<>(customerInfo, HttpStatus.OK);
    }

}
