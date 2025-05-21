package com.example.distancecalculator.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Утилитный класс для расчета расстояния между точками на сфере (формула "crowflight")
 */
public class DistanceCalculator {

    // Радиус Земли в километрах
    private static final double EARTH_RADIUS_KM = 6371.0;

    private DistanceCalculator() {
        // Приватный конструктор для утилитного класса
    }

    /**
     * Рассчитывает расстояние между двумя точками на сфере (Земле) по их координатам.
     * Использует формулу гаверсинусов для расчета расстояния на сфере.
     *
     * @param lat1 широта первой точки
     * @param lon1 долгота первой точки
     * @param lat2 широта второй точки
     * @param lon2 долгота второй точки
     * @return расстояние в километрах, округленное до 2 знаков после запятой
     */
    public static BigDecimal calculateDistance(BigDecimal lat1, BigDecimal lon1, BigDecimal lat2, BigDecimal lon2) {
        // Конвертация градусов в радианы
        double lat1Rad = Math.toRadians(lat1.doubleValue());
        double lon1Rad = Math.toRadians(lon1.doubleValue());
        double lat2Rad = Math.toRadians(lat2.doubleValue());
        double lon2Rad = Math.toRadians(lon2.doubleValue());

        // Разница координат
        double deltaLat = lat2Rad - lat1Rad;
        double deltaLon = lon2Rad - lon1Rad;

        // Формула гаверсинусов
        double a = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) *
                        Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = EARTH_RADIUS_KM * c;

        // Округление до 2 знаков после запятой
        return new BigDecimal(distance, new MathContext(10))
                .setScale(2, RoundingMode.HALF_UP);
    }
}