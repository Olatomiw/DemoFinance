package com.DemoFi.Finance.controller;

import com.DemoFi.Finance.entity.Balance;
import com.DemoFi.Finance.entity.Budget;
import com.DemoFi.Finance.entity.SavingPots;
import com.DemoFi.Finance.entity.Transaction;
import com.DemoFi.Finance.repository.BalanceRepository;
import com.DemoFi.Finance.repository.BudgetRepository;
import com.DemoFi.Finance.repository.SavingsRepository;
import com.DemoFi.Finance.repository.TransactionRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard/")
public class DashboardController {

    @Autowired
    private BudgetRepository budgetRepository;
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private BalanceRepository balanceRepository;
    @Autowired
    private SavingsRepository savingsPotRepository;


    @Operation(summary = "Get all budgets", description = "Returns a list of all budgets", tags = {"budget"})
    @ApiResponse(responseCode = "200", description = "List of budgets",
            content = @Content(schema = @Schema(implementation = Budget.class)))
    @GetMapping("/budgets")
    @ResponseStatus(HttpStatus.OK)
    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    @Operation(summary = "Get all transactions", description = "Returns a list of all transactions", tags = {"transaction"})
    @ApiResponse(responseCode = "200", description = "List of transactions",
            content = @Content(schema = @Schema(implementation = Transaction.class)))
    @GetMapping("/transactions")
    @ResponseStatus(HttpStatus.OK)
    public Page<Transaction> getAllTransactions(@RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "10") int size,
                                                @RequestParam(defaultValue = "date") String sortBy,
                                                @RequestParam(defaultValue = "asc") String direction) {
        Sort.Direction sortDirection = direction.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortDirection, sortBy));

        return transactionRepository.findAll(pageable);
    }

    @Operation(summary = "Get all balance", description = "Returns a list of all balance", tags = {"balance"})
    @ApiResponse(responseCode = "200", description = "List of balance",
            content = @Content(schema = @Schema(implementation = Balance.class)))
    @GetMapping("/balance")
    @ResponseStatus(HttpStatus.OK)
    public List<Balance> getAllBalance() {
        return balanceRepository.findAll();
    }

    @Operation(summary = "Get all savings", description = "Returns a list of all savings", tags = {"savings"})
    @ApiResponse(responseCode = "200", description = "List of savings",
            content = @Content(schema = @Schema(implementation = SavingPots.class)))
    @GetMapping("/savings")
    @ResponseStatus(HttpStatus.OK)
    public List<SavingPots> getAllSavings() {
        return savingsPotRepository.findAll();
    }

    @GetMapping("transactions/search")
    public Page<Transaction> searchTransactions(@RequestParam String query,
                                                @RequestParam(required = false, defaultValue = "") String category,
                                                @RequestParam(defaultValue = "date") String sortBy,
                                                @RequestParam(defaultValue = "desc") String direction,
                                                @RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "10") int size) {
        Sort.Direction sortDirection = direction.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortDirection, sortBy));

        return transactionRepository.findByNameContainingIgnoreCaseAndCategoryContainingIgnoreCase(query,category,pageable);
    }
}