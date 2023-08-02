package com.example.demojava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @GetMapping
    public List<Customer> customers() {
        return List.of(new Customer("Frank Tyler"), new Customer("Denise Tyler")
        , new Customer("Ethan Tyler"), new Customer("Justin Tyler"), new Customer("Colin Tyler"));
    }

}
