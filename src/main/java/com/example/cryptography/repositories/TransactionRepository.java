package com.example.cryptography.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cryptography.entities.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

}
