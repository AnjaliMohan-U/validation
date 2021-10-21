package com.example.validation.controller;

import com.example.validation.model.CustomerModel;
import com.example.validation.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customeservie;

    @PostMapping("/add-customers")
    public List<CustomerModel> addCustomers(@Valid @RequestBody CustomerModel newCustomer){
        return customeservie.addCustomers(newCustomer);
    }

    @GetMapping("/get-customer/{customerId}")
    CustomerModel getCustomer(@PathVariable String customerId){
        return customeservie.getCustomer(customerId);
    }

    @PatchMapping("/change-mobile")
    CustomerModel changeMobile(@RequestParam String customId, @RequestParam Integer number){
        return  customeservie.changeNumber(customId, number);
    }

    @DeleteMapping("/remove-customer/{customeId}")
    CustomerModel removeCustomer(@PathVariable String customeId){
        return customeservie.removeCustomer(customeId);
    }

}
//
//    @PatchMapping("/patch")
//    EmployeeModel update(@RequestParam Integer id, @RequestParam Integer phone) {
//        //System.out.println("patch1");
//        return employeeService.update(id, phone);
//    }