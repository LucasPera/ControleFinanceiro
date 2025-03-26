package com.financialcontrol.domain.model;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TransactionReportService {

    public Double calculateTotalIncome(List<Transaction> transactions) {
        return transactions.stream()
                .filter(Transaction::isExpense)
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

}
