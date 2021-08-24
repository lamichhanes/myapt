package com.storage.unit.repository.customer;

import com.storage.unit.models.customer.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerInfoRepository  extends CrudRepository<CustomerInfo, Integer> {

    CustomerInfo findCustomerInfoById(String id);

    CustomerInfo findCustomerInfoByEmail(String email);


}
