package com.example.CustomerAPI.Controller;


import com.example.CustomerAPI.Entity.CustomerEntity;
import com.example.CustomerAPI.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<CustomerEntity> GetAllCustomer(){
        return customerService.getAllCust();
    }
    @GetMapping("/{id}")
    public Optional<CustomerEntity> GetCustomerDetails(@PathVariable int id){
        return customerService.getCust(id);
    }

    @PostMapping
    public CustomerEntity create(@RequestBody CustomerEntity customerEntity){
        return customerService.createCust(customerEntity);
    }

    @PutMapping("/{id}")
    public CustomerEntity update(@PathVariable int id,@RequestBody CustomerEntity customerEntity){
        return customerService.updateCust(id,customerEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
         customerService.deleteCust(id);
    }


}
