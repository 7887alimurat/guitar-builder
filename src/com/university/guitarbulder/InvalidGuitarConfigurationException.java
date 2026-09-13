package com.university.guitarbulder;

public class InvalidGuitarConfigurationException extends RuntimeException {
    public InvalidGuitarConfigurationException(String message) {
        super(message);
    }
}