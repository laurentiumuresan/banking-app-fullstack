package net.javaguides.bankingapp.service;

import net.javaguides.bankingapp.dto.AccountDto;
import net.javaguides.bankingapp.dto.TransactionDto;
import net.javaguides.bankingapp.dto.TransferFundDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

    void transferFounds(TransferFundDto transferFundDto);

    List<TransactionDto> getAccountTransactions(Long accountId);
}
