package net.javaguides.bankingapp.exception;

import java.time.LocalDateTime;

public record ErrorDetails(LocalDateTime dateTime,
                           String message,
                           String details,
                           String errorCode) {
}
