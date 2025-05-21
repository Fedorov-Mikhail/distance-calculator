package com.example.distancecalculator.model.dto;

import com.example.distancecalculator.model.CalculationType;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO для результата расчета расстояния
 */
public class DistanceResultDto implements Serializable {

    private String fromCity;
    private String toCity;
    private BigDecimal distance;
    private CalculationType calculationType;

    // Конструкторы
    public DistanceResultDto() {
    }

    public DistanceResultDto(String fromCity, String toCity, BigDecimal distance, CalculationType calculationType) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
        this.calculationType = calculationType;
    }

    // Геттеры и сеттеры
    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public CalculationType getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(CalculationType calculationType) {
        this.calculationType = calculationType;
    }
}