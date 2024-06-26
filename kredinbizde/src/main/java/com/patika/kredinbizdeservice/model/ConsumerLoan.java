package com.patika.kredinbizdeservice.model;

import java.math.BigDecimal;
import java.util.List;

import com.patika.kredinbizdeservice.enums.LoanType;

public class ConsumerLoan extends Loan {

    private LoanType loanType = LoanType.IHTIYAC_KREDISI;
    private List<Integer> installmentOptions;

    public ConsumerLoan() {

    }

    public ConsumerLoan(BigDecimal amount, Integer installment, Double interestRate) {
        super(amount, installment, interestRate);
    }

    public LoanType getLoanType() {
        return loanType;
    }

    @Override
    void calculate(BigDecimal amount, int installment) {
        //tc bul, maaşı bul
    }


}