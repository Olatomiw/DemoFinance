package com.DemoFi.Finance.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "saving_pots")
@Getter
@Setter
public class SavingPots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;
    @NotNull(message = "Target is required")
    private BigDecimal target;
    @NotNull(message = "Total is required")
    private BigDecimal total;
    @NotBlank(message = "Theme color is required")
    private String theme;
}
