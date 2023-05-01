package com.example.compoundInterestCalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CompoundInterestService {

    public Double calculateCompoundInterest(Double principal, Double rate, Double time) {
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }
}