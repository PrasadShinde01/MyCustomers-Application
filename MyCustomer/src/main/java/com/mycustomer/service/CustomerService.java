package com.mycustomer.service;
import java.util.List;

import com.mycustomer.model.Customer;

public interface CustomerService {
    List <Customer> getAllCustomer();
    void saveCustomer(Customer customer);
    Customer getCustomerById(long id);
    void deleteCustomerById(long id);
    }
