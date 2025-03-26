package com.financialcontrol.infrastructure.persistence;

import java.util.List;

import com.financialcontrol.domain.model.Transaction;

public interface TransactionRepository {

    List<Transaction> findAll();

    Transaction save(Transaction transaction);

    void deleteById(Long id);

    // You can add custom query methods as needed
    List<Transaction> findByCategory(String category);


}
