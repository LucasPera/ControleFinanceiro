package com.financialcontrol.infrastructure.persistence.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.financialcontrol.domain.model.Transaction;
import com.financialcontrol.infrastructure.persistence.TransactionRepository;


@Repository
public class TransactionRepositoryImpl implements TransactionRepository  {

   private final JpaTransactionRepository jpaTransactionRepository;

    public TransactionRepositoryImpl(JpaTransactionRepository jpaTransactionRepository) {
        this.jpaTransactionRepository = jpaTransactionRepository;
    }

    @Override
    public List<Transaction> findAll() {
        return jpaTransactionRepository.findAll();
    }

    @Override
    public Transaction save(Transaction transaction) {
        return jpaTransactionRepository.save(transaction);
    }

    @Override
    public void deleteById(Long id) {
        jpaTransactionRepository.deleteById(id);
    }

    @Override
    public List<Transaction> findByCategory(String category) {
        return jpaTransactionRepository.findByCategory(category);
    }


}
