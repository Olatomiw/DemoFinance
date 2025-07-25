//package com.DemoFi.Finance.config;
//
//import com.DemoFi.Finance.entity.SeedData;
//import com.DemoFi.Finance.repository.BalanceRepository;
//import com.DemoFi.Finance.repository.BudgetRepository;
//import com.DemoFi.Finance.repository.SavingsRepository;
//import com.DemoFi.Finance.repository.TransactionRepository;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.stereotype.Component;
//
//import java.io.InputStream;
//
//@Component
//public class DataSeeder implements CommandLineRunner {
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    private TransactionRepository transactionRepository;
//
//    @Autowired
//    private BudgetRepository budgetRepository;
//
//    @Autowired
//    private BalanceRepository balanceRepository;
//
//    @Autowired
//    private SavingsRepository savingsPotRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        ClassPathResource resource = new ClassPathResource("data.json");
//
//        InputStream inputStream = resource.getInputStream();
//        SeedData seedData = objectMapper.readValue(inputStream, SeedData.class);
//
//        // Save balance
//        balanceRepository.save(seedData.getBalance());
//
//        // Save transactions
//        transactionRepository.saveAll(seedData.getTransactions());
//
//        // Save budgets
//        budgetRepository.saveAll(seedData.getBudgets());
//
//        // Save savings pots
//        savingsPotRepository.saveAll(seedData.getPots().);
//    }
//}
