package com.example.compoundInterestCalculator.repository;

import com.example.compoundInterestCalculator.entity.CompoundInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompoundInterestRepository extends JpaRepository<CompoundInterest, Long> {

}