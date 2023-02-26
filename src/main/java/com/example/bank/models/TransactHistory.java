package com.example.bank.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "v_transaction_history")
public class TransactHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int account_id;
    private int user_id;
    private String transaction_type;
    private double amount;
    private String  source;
    private String  status;
    private String  reason_code;
    private LocalDateTime created_at;
}
