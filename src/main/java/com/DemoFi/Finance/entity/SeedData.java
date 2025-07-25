package com.DemoFi.Finance.entity;

import java.util.List;

public class SeedData {
    private Balance balance;
    private List<Transaction> transactions;
    private List<Budget> budgets;
    private List<SavingPots> pots;
    // Getters and setters


    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Budget> getBudgets() {
        return budgets;
    }

    public void setBudgets(List<Budget> budgets) {
        this.budgets = budgets;
    }

    public List<SavingPots> getPots() {
        return pots;
    }

    public void setPots(List<SavingPots> pots) {
        this.pots = pots;
    }
}

