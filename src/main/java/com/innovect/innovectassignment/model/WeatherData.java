package com.innovect.innovectassignment.model;

import java.util.List;

public class WeatherData {
    private List<HourlyWeatherData> hourlyData;
    private City city;

    public WeatherData(List<HourlyWeatherData> hourlyData, City city) {
        this.hourlyData = hourlyData;
        this.city = city;
    }
}
