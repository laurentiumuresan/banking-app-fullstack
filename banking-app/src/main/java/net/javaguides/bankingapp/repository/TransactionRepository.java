package net.javaguides.bankingapp.repository;

import net.javaguides.bankingapp.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountIdOrderByDateTimeDesc(Long accountId);
}
