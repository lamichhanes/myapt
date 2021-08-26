package com.myapt.service.customer;

import com.myapt.models.customer.CustomerInfo;
import com.myapt.repository.customer.CustomerInfoRepository;
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

    @Override
    public CustomerInfo findCustomerByCustomerId(Long customerId) {
        return customerInfoRepository.findCustomerInfoByCustomerId(customerId);
    }

}
