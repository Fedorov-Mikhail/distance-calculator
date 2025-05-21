package com.example.distancecalculator.exception;

/**
 * Исключение, генерируемое когда расстояние между городами не найдено
 */
public class DistanceNotFoundException extends DistanceCalculatorException {

    public DistanceNotFoundException(String message) {
        super(message);
    }

    public DistanceNotFoundException(Long fromCityId, Long toCityId) {
        super("Distance between cities with IDs " + fromCityId + " and " + toCityId + " not found");
    }
}