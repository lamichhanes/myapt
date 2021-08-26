package com.myapt.service.customer;

import com.myapt.models.customer.CustomerInfo;

public interface CustomerInfoService {

    void saveCustomer(CustomerInfo customerInfo) throws Exception;

    public CustomerInfo findCustomerByCustomerId(Long customerId);
}
