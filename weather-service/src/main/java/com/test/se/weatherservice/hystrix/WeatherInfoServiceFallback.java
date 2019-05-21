package com.test.se.weatherservice.hystrix;

import com.test.se.weatherservice.response.Error;
import com.test.se.weatherservice.response.WeatherInfo;
import com.test.se.weatherservice.service.WeatherInfoService;
import org.springframework.stereotype.Component;

@Component
public class WeatherInfoServiceFallback implements WeatherInfoService {

    @Override
    public WeatherInfo fetchCurrentWeatherForTheCity(String key, String query) {
        WeatherInfo info=new WeatherInfo();
        info.setError(new Error());
        info.getError().setCode(10006);
        info.getError().setMessage("Unable to find the weather for given city");
        return info;
    }
}