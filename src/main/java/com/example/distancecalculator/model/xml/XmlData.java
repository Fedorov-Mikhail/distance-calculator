package com.example.distancecalculator.model.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Корневой элемент для XML с данными о городах и расстояниях
 */
@XmlRootElement(name = "data")
public class XmlData {

    private List<XmlCity> cities;
    private List<XmlDistance> distances;

    public XmlData() {
        this.cities = new ArrayList<>();
        this.distances = new ArrayList<>();
    }

    @XmlElement(name = "cities")
    public List<XmlCity> getCities() {
        return cities;
    }

    public void setCities(List<XmlCity> cities) {
        this.cities = cities;
    }

    @XmlElement(name = "distances")
    public List<XmlDistance> getDistances() {
        return distances;
    }

    public void setDistances(List<XmlDistance> distances) {
        this.distances = distances;
    }
}