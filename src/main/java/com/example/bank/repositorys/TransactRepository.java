package com.example.bank.repositorys;

import com.example.bank.models.Transact;
import org.springframework.data.repository.CrudRepository;

public interface TransactRepository extends CrudRepository<Transact, Long> {
}