package com.example.cours3;

import com.example.cours3.DAL.Services.Impl.CustomerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cours3Application {
    private final Logger logger = LoggerFactory.getLogger(Cours3Application.class);

    @Autowired
    private CustomerServiceImpl customerService;

    public static void main(String[] args) {
        SpringApplication.run(Cours3Application.class, args);
    }

}
