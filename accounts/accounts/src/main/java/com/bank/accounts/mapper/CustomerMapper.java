package com.bank.accounts.mapper;

import com.bank.accounts.BaseEntity.Customer;
import com.bank.accounts.constants.AccountsConstants;
import com.bank.accounts.dto.CustomerDto;

public class CustomerMapper {

    public static CustomerDto mapToCustomerdto(Customer customer,CustomerDto customerDto){

        customerDto.setAddress(customer.getAddress());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        customerDto.setName(customer.getName());



        return customerDto;

    }

    public static Customer mapToCustomer(Customer customer,CustomerDto customerDto){

        customer.setAddress(customerDto.getAddress());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        customer.setAccountType(AccountsConstants.SAVINGS);
        customer.setName(customerDto.getName());

        return customer;

    }
}
