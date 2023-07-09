package com.upgrad.customeronboardingservicemaster.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String customerId;
    private String bankingCustomerId;
    private String customerMobileNumber;
    private LocalDate customerDateOfBirth;
    private String customerStatus;
}
