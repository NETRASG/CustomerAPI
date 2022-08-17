package com.example.CustomerAPI.Service;

import com.example.CustomerAPI.Entity.CustomerEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<CustomerEntity> getAllCust();
    Optional<CustomerEntity> getCust(int id);
    CustomerEntity createCust(CustomerEntity customerEntity);
    CustomerEntity updateCust(int id,CustomerEntity customerEntity);
    void deleteCust(int id);

}
