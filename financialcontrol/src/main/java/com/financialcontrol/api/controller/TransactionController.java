package com.financialcontrol.api.controller;

import com.financialcontrol.application.service.TransactionService;
import com.financialcontrol.domain.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> getAll() {
        return transactionService.getAllTransactions();
    }

    @PostMapping
    public Transaction save(@RequestBody Transaction transaction) {
        return transactionService.saveTransaction(transaction);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        transactionService.deleteTransaction(id);
    }

}
