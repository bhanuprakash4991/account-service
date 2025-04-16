package com.bank.accounts.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class AccountsDto {

    public Long accountNumber;
    public String branchAddress;
    public String accountType;

    public AccountsDto() {

    }
}
