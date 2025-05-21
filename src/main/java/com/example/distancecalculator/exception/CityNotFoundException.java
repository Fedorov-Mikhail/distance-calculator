package com.example.distancecalculator.exception;

/**
 * Исключение, генерируемое когда город не найден
 */
public class CityNotFoundException extends DistanceCalculatorException {

    public CityNotFoundException(String message) {
        super(message);
    }

    public CityNotFoundException(Long cityId) {
        super("City with ID " + cityId + " not found");
    }
}