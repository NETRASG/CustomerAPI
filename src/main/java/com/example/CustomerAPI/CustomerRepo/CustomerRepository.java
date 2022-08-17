package com.example.CustomerAPI.CustomerRepo;

import com.example.CustomerAPI.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer>{
}
