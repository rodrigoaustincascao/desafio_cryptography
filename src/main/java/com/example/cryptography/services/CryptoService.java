package com.example.cryptography.services;

import org.jasypt.util.text.StrongTextEncryptor;
import org.springframework.beans.factory.annotation.Value;

public class CryptoService {

    private static final StrongTextEncryptor encryptor;

    @Value("${app.key}")
    private String appKey;

    static {
        encryptor = new StrongTextEncryptor();
        encryptor.setPassword("123");
    }

    public static String encrypt(String rawText) {
        return encryptor.encrypt(rawText);
    }

    public static String decrypt(String encryptedText) {
        return encryptor.decrypt(encryptedText);
    }
}
