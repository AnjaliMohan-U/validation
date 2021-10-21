package com.example.validation.service;

import com.example.validation.model.CustomerModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private List<CustomerModel> customers;
    public List<CustomerModel> addCustomers(CustomerModel newCustomer) {
        if(customers==null){
            customers = new ArrayList<>();
        }
        customers.add(newCustomer);
        return customers;
    }

    public CustomerModel getCustomer(String customerId) {
        Optional<CustomerModel> customer = customers.stream().filter(c -> c.getCustomerId().equals(customerId)).findFirst();
        return customer.isPresent() ? customer.get() : null;
    }

    public CustomerModel changeNumber(String customId, int number) {
        Optional<CustomerModel> update_customer = customers.stream().filter(c -> c.getCustomerId().equals(customId)).findFirst();
        update_customer.get().setMobile(number);
        return update_customer.get();
    }

    public CustomerModel removeCustomer(String customeId) {
        Optional<CustomerModel> remove_customer = customers.stream().filter(c -> c.getCustomerId().equals(customeId)).findFirst();
        remove_customer.ifPresent(customerModel -> customers.remove(remove_customer));
        return remove_customer.get();
    }
}
