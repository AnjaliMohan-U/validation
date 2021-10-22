package com.example.validation.service;

import com.example.validation.model.CustomerModel;
import org.hibernate.validator.constraints.ru.INN;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.*;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;


@RunWith(MockitoJUnitRunner.class)
public class CustomServiceTest {
    @InjectMocks CustomerService customerService;

    @Before
    public void addCustom(){
        CustomerModel c1 = new CustomerModel("c1","ram","ram@gmail.com","abc,abc,abc",1234567890);
        CustomerModel c2 = new CustomerModel("c2","sita","sita@gmail.com","efg,efg,efg",567892345);
        CustomerModel c3 = new CustomerModel("c3","bharath","abc","hij,hij,hij",897250364);
        CustomerModel c4 = new CustomerModel("c4","shathrugna","shatru@gmail.com","klm,klm,klm",365789143);
        customerService.addCustomers(c1);
        customerService.addCustomers(c2);
        customerService.addCustomers(c3);
        customerService.addCustomers(c4);
    }


    @Test
    public void getCustomerById(){
        CustomerModel customer = customerService.getCustomer("c1");
        assertEquals("c1", customer.getCustomerId());
    }



}
