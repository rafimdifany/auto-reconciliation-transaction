package com.rafimdifany.auto_reconciliation_transaction.controller;

import com.rafimdifany.auto_reconciliation_transaction.entity.Transaction;
import com.rafimdifany.auto_reconciliation_transaction.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {


    @Autowired
    private TransactionRepository transactionRepository;


    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }
}
