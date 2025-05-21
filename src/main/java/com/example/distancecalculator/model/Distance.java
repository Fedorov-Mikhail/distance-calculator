package com.example.distancecalculator.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "distance",
        uniqueConstraints = @UniqueConstraint(columnNames = {"from_city_id", "to_city_id"},
                name = "uq_from_to_city"))
@XmlRootElement
public class Distance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_city_id", nullable = false)
    private City fromCity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_city_id", nullable = false)
    private City toCity;

    @Column(name = "distance", nullable = false, precision = 10, scale = 2)
    private BigDecimal distance;

    // Конструкторы
    public Distance() {
    }

    public Distance(City fromCity, City toCity, BigDecimal distance) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public City getFromCity() {
        return fromCity;
    }

    public void setFromCity(City fromCity) {
        this.fromCity = fromCity;
    }

    public City getToCity() {
        return toCity;
    }

    public void setToCity(City toCity) {
        this.toCity = toCity;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return Objects.equals(id, distance1.id) &&
                Objects.equals(fromCity, distance1.fromCity) &&
                Objects.equals(toCity, distance1.toCity) &&
                Objects.equals(distance, distance1.distance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fromCity, toCity, distance);
    }

    @Override
    public String toString() {
        return "Distance{" +
                "id=" + id +
                ", fromCity=" + (fromCity != null ? fromCity.getName() : null) +
                ", toCity=" + (toCity != null ? toCity.getName() : null) +
                ", distance=" + distance +
                '}';
    }
}