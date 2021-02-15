package com.example.cours3.DAL.Services;

import com.example.cours3.BLL.Models.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer create(Customer customer);

    Optional<Customer> readOne(long id);

    List<Customer> readAll();

    void delete(long id);

    List<Customer> getAllCustomerSortedByLastName();

    Customer updateFirstNameAndLastName(long customerId,String firstName,String lastName);

}
