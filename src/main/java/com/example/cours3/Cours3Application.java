package com.example.cours3;

import com.example.cours3.BLL.Models.Customer;
import com.example.cours3.DAL.Services.Impl.CustomerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cours3Application {
    private final Logger log = LoggerFactory.getLogger(Cours3Application.class);

    @Autowired
    private CustomerServiceImpl customerService;

    public static void main(String[] args) {
        SpringApplication.run(Cours3Application.class, args);
    }

    @Bean
    void requestCustomer() {

        //get all customers
        //List<Customer> customers = customerService.readAll();
        //log.info("All customers {} ", customers.toString());

        //get all customers sorted by lastname
        List<Customer> customers1 = customerService.getAllCustomerSortedByLastName();
        log.info("All customers sorted by lastname {} ", customers1.toString());

        //get customer by id
        Optional<Customer> customerRecover = customerService.readOne((long) 11);
        customerRecover.ifPresent(c -> log.info("Get one customer {} ", c.toString()));

        //update customer
        Customer customerUpdated = customerService.updateFirstNameAndLastName((long) 1, "STEPHANIE", "CLARA");
        log.info("Customer updated {} ", customerUpdated.toString());
    }

}
