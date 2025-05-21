package com.example.distancecalculator.model.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO для ответа с результатами расчета расстояний
 */
public class DistanceResponseDto implements Serializable {

    private List<DistanceResultDto> results;

    // Конструкторы
    public DistanceResponseDto() {
    }

    public DistanceResponseDto(List<DistanceResultDto> results) {
        this.results = results;
    }

    // Геттеры и сеттеры
    public List<DistanceResultDto> getResults() {
        return results;
    }

    public void setResults(List<DistanceResultDto> results) {
        this.results = results;
    }
}