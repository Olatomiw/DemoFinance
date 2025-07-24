package com.DemoFi.Finance.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "balances")
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "The balance cannot be null")
    private BigDecimal current;
    @NotNull(message = "The income cannot be null")
    private BigDecimal income;
    @NotNull(message = "The expenses cannot be null")
    private BigDecimal expenses;
}
