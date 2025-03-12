package com.rafimdifany.auto_reconciliation_transaction.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transactionCode;
    private String referenceNumber;
    private BigDecimal amount;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus = TransactionStatus.DEFAULT;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;


    public enum TransactionStatus {
        DEFAULT,
        PENDING,
        PROCESSING,
        SUCCESS,
        FAILED,
        DUPLICATE
    }
}
