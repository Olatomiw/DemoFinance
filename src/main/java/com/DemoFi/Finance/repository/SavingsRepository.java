package com.DemoFi.Finance.repository;

import com.DemoFi.Finance.entity.SavingPots;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsRepository extends JpaRepository<SavingPots, Long> {
}
