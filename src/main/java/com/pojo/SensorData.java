package com.pojo;

public class SensorData {
    private int dId;
    //private String time;
    private double temperature;//温度
    private double humidity;//湿度
    private int illumination;//光照

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }


    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getIllumination() {
        return illumination;
    }

    public void setIllumination(int illumination) {
        this.illumination = illumination;
    }
}
