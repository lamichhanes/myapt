package com.storage.unit.service.customer;

import com.storage.unit.models.customer.CustomerInfo;

public interface CustomerInfoService {

    void saveCustomer(CustomerInfo customerInfo) throws Exception;
}
