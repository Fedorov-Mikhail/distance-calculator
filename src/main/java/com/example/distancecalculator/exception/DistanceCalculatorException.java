package com.example.distancecalculator.exception;

/**
 * Базовое исключение для приложения расчета расстояний
 */
public class DistanceCalculatorException extends RuntimeException {

    public DistanceCalculatorException(String message) {
        super(message);
    }

    public DistanceCalculatorException(String message, Throwable cause) {
        super(message, cause);
    }
}