package com.rafimdifany.auto_reconciliation_transaction.repository;

import com.rafimdifany.auto_reconciliation_transaction.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
