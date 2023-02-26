package com.example.bank.repositorys;

import com.example.bank.models.TransactHistory;
import org.springframework.data.repository.CrudRepository;

public interface TransactHistoryRepository extends CrudRepository<TransactHistory, Long> {
}