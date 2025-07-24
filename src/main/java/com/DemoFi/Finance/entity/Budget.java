package com.DemoFi.Finance.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table (name = "budgets")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Category is required")
    private String category;
    @NotNull(message = "Amount is required")
    private BigDecimal maximum;
    private String themeColor;
}
