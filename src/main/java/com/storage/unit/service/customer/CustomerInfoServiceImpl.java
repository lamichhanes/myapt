package com.storage.unit.service.customer;

import com.storage.unit.models.customer.CustomerInfo;
import com.storage.unit.repository.customer.CustomerInfoRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

    @Autowired
    private CustomerInfoRepository customerInfoRepository;


    @Override
    public void saveCustomer(CustomerInfo customerInfo) throws Exception {
        if ( customerInfo != null) {
            customerInfoRepository.save(customerInfo);
        } else {
            throw new Exception("CustomerInfo cannot be empty");
        }
    }
}
