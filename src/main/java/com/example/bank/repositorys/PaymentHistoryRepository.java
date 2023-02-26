package com.example.bank.repositorys;

import com.example.bank.models.PaymentHistory;
import org.springframework.data.repository.CrudRepository;

public interface PaymentHistoryRepository extends CrudRepository<PaymentHistory, Long> {
}