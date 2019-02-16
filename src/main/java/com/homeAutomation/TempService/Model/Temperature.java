package com.homeAutomation.TempService.Model;

public class Temperature {
    public Temperature(String id, double temperature) {
        this.temperature = temperature;
        this.id = id;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    private double temperature;
    private String id;
}
