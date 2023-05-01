package com.example.compoundInterestCalculator.controller;

import com.example.compoundInterestCalculator.service.CompoundInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compound-interest")
public class CompoundInterestController {

    @Autowired
    private CompoundInterestService compoundInterestService;

    @PostMapping
    public Double calculateCompoundInterest(@RequestParam Double principal, @RequestParam Double rate, @RequestParam Double time) {
        return compoundInterestService.calculateCompoundInterest(principal, rate, time);
    }
}