package com.example.bank.repositorys;

import com.example.bank.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}