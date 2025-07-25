package com.DemoFi.Finance.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Category is required")
    private String category;
    @NotNull(message = "Date is required")
    private LocalDateTime date;
    @NotNull(message = "Amount is required")
    private BigDecimal amount;
    private Boolean recurring;
    @NotBlank(message = "Avatar URL is required")
    private String avatar;
}
