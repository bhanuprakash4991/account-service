package com.bank.accounts.mapper;

import com.bank.accounts.BaseEntity.Accounts;
import com.bank.accounts.dto.AccountsDto;

public class AccountMapper {

    public static AccountsDto mapToAccountDto (Accounts accounts , AccountsDto accountsDto){

        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;

    }

    public static Accounts mapToAccount (AccountsDto accountsDto,Accounts accounts ){

        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;

    }

}
