package com.example.distancecalculator.model.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * XML-представление расстояния для загрузки данных
 */
@XmlRootElement(name = "distance")
public class XmlDistance {

    private String fromCity;
    private String toCity;
    private BigDecimal distance;

    public XmlDistance() {
    }

    public XmlDistance(String fromCity, String toCity, BigDecimal distance) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
    }

    @XmlElement(name = "fromCity")
    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    @XmlElement(name = "toCity")
    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    @XmlElement(name = "distance")
    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }
}