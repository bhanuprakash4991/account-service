package com.bank.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class CustomerDto {

    @NotEmpty(message = "name not be null")
    public String name;

    @NotEmpty @Email
    public String email;
    public String address;
    public String mobileNumber;

    public AccountsDto accountsDto;

    public CustomerDto() {

    }
}
