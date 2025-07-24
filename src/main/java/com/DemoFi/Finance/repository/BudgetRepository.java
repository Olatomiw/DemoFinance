package com.DemoFi.Finance.repository;

import com.DemoFi.Finance.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
