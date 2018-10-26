package com.innovect.innovectassignment.service;

import com.innovect.innovectassignment.model.WeatherData;
import org.springframework.stereotype.Service;

@Service
public class WeatherDataService {

    public WeatherData getHourlyData(String zip) {
        //api call
        return new WeatherData(null, null);
    }
}
