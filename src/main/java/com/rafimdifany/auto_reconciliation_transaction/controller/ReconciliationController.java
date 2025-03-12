package com.rafimdifany.auto_reconciliation_transaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReconciliationController {


    @GetMapping("/reconciliations")
    public String getReconciliation() {
        return "Success";
    }
}
