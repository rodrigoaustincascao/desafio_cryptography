package com.example.cryptography.dtos;

public record CreateTransactionRequest(String userDocument, String creditCardToken, Long transactionValue) {

}
