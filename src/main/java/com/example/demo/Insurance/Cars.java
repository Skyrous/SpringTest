package com.example.demo.Insurance;

import org.springframework.beans.factory.annotation.Value;

public class Cars extends Insurance{
    @Value("$manufacturer.myValue: Audi")
private String manufacturer;
    @Value("$model.myValue: A4")
private String model;
    @Value("$color.myValue: red")
private String color;
    @Value("$yearOfFabrication.myValue: 2014")
private Integer yearOfFabrication;
    @Value("$horsePower.myValue: 180")

private Integer horsePower;

    public Cars(String manufacturer, String model, String color, Integer yearOfFabrication, Integer horsePower) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.yearOfFabrication = yearOfFabrication;
        this.horsePower = horsePower;
    }

    public Cars(String manufacturer, String model, Integer yearOfFabrication, Integer horsePower) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfFabrication = yearOfFabrication;
        this.horsePower = horsePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYearOfFabrication() {
        return yearOfFabrication;
    }

    public void setYearOfFabrication(Integer yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}

