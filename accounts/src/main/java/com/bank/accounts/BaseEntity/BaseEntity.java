package com.bank.accounts.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

    @Column(updatable = false)
    public LocalDateTime createdOn;

    @Column(updatable = false)
    public String createdBy;

    @Column(insertable = false)
    public LocalDateTime updatedOn;

    @Column(insertable = false)
    public String updatedBy;
}
