package com.innovect.innovectassignment.model;


public class HourlyWeatherData {
    private String minTemp;
    private String maxTemp;
    private String timeStamp;

    public HourlyWeatherData(String minTemp, String maxTemp, String timeStamp) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.timeStamp = timeStamp;
    }
}
