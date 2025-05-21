package com.example.distancecalculator.model.dto;

import java.io.Serializable;

/**
 * DTO для отображения базовой информации о городе
 */
public class CityDto implements Serializable {

    private Long id;
    private String name;

    // Конструкторы
    public CityDto() {
    }

    public CityDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}