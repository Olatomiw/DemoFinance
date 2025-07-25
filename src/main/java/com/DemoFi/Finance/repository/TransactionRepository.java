package com.DemoFi.Finance.repository;

import com.DemoFi.Finance.entity.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Page<Transaction> findByNameContainingIgnoreCaseAndCategoryContainingIgnoreCase(String name,String category, Pageable pageable);
    Page<Transaction> findAll(Pageable pageable);
}
