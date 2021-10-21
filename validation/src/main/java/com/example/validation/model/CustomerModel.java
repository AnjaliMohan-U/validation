package com.example.validation.model;

import javax.validation.constraints.*;

public class CustomerModel {
    @NotEmpty
    private String customerId;
    @Pattern(regexp="^[a-zA-Z ]+$", message = "name must be a string")
    private String name;
    @Email(message = "[${validatedValue}] is not valid. please enter a valid email address")
    private String email;
    private String address;
    private int mobile;

    public CustomerModel(String customerId, String name, String email, String address, int mobile) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
    }
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }


    @Override
    public String toString() {
        return "CustomerModel{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
