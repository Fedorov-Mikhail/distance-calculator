package com.example.distancecalculator.model.dto;

import com.example.distancecalculator.model.CalculationType;

import java.io.Serializable;

/**
 * DTO для запроса расчета расстояния
 */
public class DistanceRequestDto implements Serializable {

    private CalculationType type;
    private Long fromCity;
    private Long toCity;

    // Конструкторы
    public DistanceRequestDto() {
    }

    public DistanceRequestDto(CalculationType type, Long fromCity, Long toCity) {
        this.type = type;
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    // Геттеры и сеттеры
    public CalculationType getType() {
        return type;
    }

    public void setType(CalculationType type) {
        this.type = type;
    }

    public Long getFromCity() {
        return fromCity;
    }

    public void setFromCity(Long fromCity) {
        this.fromCity = fromCity;
    }

    public Long getToCity() {
        return toCity;
    }

    public void setToCity(Long toCity) {
        this.toCity = toCity;
    }
}