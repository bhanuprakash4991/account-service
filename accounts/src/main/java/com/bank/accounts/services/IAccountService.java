package com.bank.accounts.services;


import com.bank.accounts.dto.CustomerDto;

public interface IAccountService {

    void createAccount (CustomerDto customerDto);
    CustomerDto fetchCustomer(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
