package net.javaguides.bankingapp.dto;

public record TransferFundDto (Long fromAccountId,
                               Long toAccountId,
                               double amount){
}
