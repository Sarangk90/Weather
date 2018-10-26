package com.innovect.innovectassignment.Controller;

import com.innovect.innovectassignment.model.WeatherData;
import com.innovect.innovectassignment.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class WeatherDataController {

    @Autowired
    WeatherDataService weatherDataService;

    @GetMapping(value = "/weather-data")
    public WeatherData hourlyWeatherData(@RequestParam String zipCode) {
        return weatherDataService.getHourlyData(zipCode);
    }
}
