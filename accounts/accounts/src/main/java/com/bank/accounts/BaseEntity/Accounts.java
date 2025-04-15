package com.bank.accounts.BaseEntity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{


    public Long customerId;

    @Id
    @Column(name="account_number")
    public Long accountNumber;

    @Column(name="branch_address")
    public String branchAddress;
    public String accountType;


}
