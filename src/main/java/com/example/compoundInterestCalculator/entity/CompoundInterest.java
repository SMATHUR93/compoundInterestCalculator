package com.example.compoundInterestCalculator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compound_interest")
public class CompoundInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double principal;

    private Double rate;

    private Double time;

    private Double compoundInterest;

    // Getters and Setters
}