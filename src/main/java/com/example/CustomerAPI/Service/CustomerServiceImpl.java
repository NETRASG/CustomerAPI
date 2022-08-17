package com.example.CustomerAPI.Service;

import com.example.CustomerAPI.CustomerRepo.CustomerRepository;
import com.example.CustomerAPI.Entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<CustomerEntity> getAllCust() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<CustomerEntity> getCust(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public CustomerEntity createCust(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }

    @Override
    public CustomerEntity updateCust(int id, CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }

    @Override
    public void deleteCust(int id) {
        customerRepository.deleteById(id);
    }
}
