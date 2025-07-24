package com.DemoFi.Finance.repository;

import com.DemoFi.Finance.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
