package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
            new Customer(1L, "James Babashka", "dedimedi213", "email@gmail.com"),
            new Customer(2L, "Debila Gahmedaviovius", "kukiMindamamasita", "email@gmail.com")
        );
    }
}
