package com.financialcontrol.infrastructure.persistence.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financialcontrol.domain.model.Transaction;

public interface JpaTransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByCategory(String category);

}
