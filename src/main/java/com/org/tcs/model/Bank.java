package com.org.tcs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table
@Data
public class Bank {
    @Id
    private int accountNum;
    private String bankName;
    private String ifscCode;
    private double bankBalance;


}
