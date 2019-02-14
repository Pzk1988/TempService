package com.homeAutomation.TempService.Model;

public class Temperature {
    public Temperature(String id, int temperature) {
        this.temperature = temperature;
        this.id = id;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    private int temperature;
    private String id;
}
