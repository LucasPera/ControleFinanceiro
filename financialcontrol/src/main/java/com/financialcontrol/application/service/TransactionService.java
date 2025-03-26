package com.financialcontrol.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.financialcontrol.domain.model.Transaction;
import com.financialcontrol.domain.model.TransactionReportService;
import com.financialcontrol.infrastructure.persistence.TransactionRepository;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final TransactionReportService transactionReportService;

    public TransactionService(TransactionRepository transactionRepository, TransactionReportService transactionReportService) {
        this.transactionRepository = transactionRepository;
        this.transactionReportService = transactionReportService;
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction saveTransaction(Transaction transaction) {
        // Here you could add validation logic specific to application rules
        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }

    public Double getTotalExpenses() {
        return transactionReportService.calculateTotalIncome(getAllTransactions());
    }
}

