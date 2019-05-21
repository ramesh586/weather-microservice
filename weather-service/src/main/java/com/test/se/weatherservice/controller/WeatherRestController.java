package com.test.se.weatherservice.controller;

import com.test.se.weatherservice.exception.WeatherInfoNotFoundException;
import com.test.se.weatherservice.response.WeatherInfo;
import com.test.se.weatherservice.service.WeatherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("v1/")
public class WeatherRestController {

    @Autowired
    private WeatherInfoService weatherInfoService;

    @Value("${weather.service.api.key}")
    private String weatherKey;


    @GetMapping(value = "search-by-city",produces = "text/html")
    public ResponseEntity<String> getCurrentWeather(@RequestParam("city")String city){

        WeatherInfo info=Optional.ofNullable(weatherInfoService.fetchCurrentWeatherForTheCity(weatherKey,city))
                .orElseThrow(()->new WeatherInfoNotFoundException(HttpStatus.BAD_REQUEST,"Unable to fetch weather information for the city given","Unable to get the data"));
        Optional.ofNullable(info.getError()).ifPresent(e-> {throw new RuntimeException(e.getMessage());});
        String sb = "Weather information of city " +
                city +
                ":  " +
                info.getCurrent().getTempF() +
                "f, " +
                info.getCurrent().getTempC() +
                "c";
        return ResponseEntity.ok(sb);
    }
}
