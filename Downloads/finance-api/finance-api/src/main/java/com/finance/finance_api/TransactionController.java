package com.finance.finance_api;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "*")
public class TransactionController {

    private List<Transaction> transactions = new ArrayList<>();
    private Long counter = 1L;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        transaction.setId(counter++);
        transactions.add(transaction);
        return transaction;
    }

    @DeleteMapping("/{id}")
    public String deleteTransaction(@PathVariable Long id) {
        transactions.removeIf(t -> t.getId().equals(id));
        return "Transaction deleted!";
    }

    @GetMapping("/summary")
    public Map<String, Double> getSummary() {
        double income = transactions.stream()
            .filter(t -> t.getType().equals("INCOME"))
            .mapToDouble(Transaction::getAmount).sum();

        double expense = transactions.stream()
            .filter(t -> t.getType().equals("EXPENSE"))
            .mapToDouble(Transaction::getAmount).sum();

        Map<String, Double> summary = new HashMap<>();
        summary.put("totalIncome", income);
        summary.put("totalExpense", expense);
        summary.put("balance", income - expense);
        return summary;
    }
}