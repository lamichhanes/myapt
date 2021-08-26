package com.myapt.repository.customer;

import com.myapt.models.customer.CustomerInfo;
import org.springframework.data.repository.CrudRepository;

public interface CustomerInfoRepository  extends CrudRepository<CustomerInfo, Long> {

    CustomerInfo findCustomerInfoByCustomerId(Long customerId);

    CustomerInfo findCustomerInfoByEmail(String email);



}
