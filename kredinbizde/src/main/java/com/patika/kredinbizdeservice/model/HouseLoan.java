package com.patika.kredinbizdeservice.model;

import java.math.BigDecimal;

import com.patika.kredinbizdeservice.enums.LoanType;

public class HouseLoan extends Loan {

    private LoanType loanType = LoanType.KONUT_KREDISI;

    public HouseLoan() {

    }

    public HouseLoan(BigDecimal amount, Integer installment, Double interestRate) {
        super(amount, installment, interestRate);
    }

    public LoanType getLoanType() {
        return loanType;
    }

    @Override
    void calculate(BigDecimal amount, int installment) {

    }
}