package com.DemoFi.Finance.repository;

import com.DemoFi.Finance.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository extends JpaRepository<Balance, Long> {
}
