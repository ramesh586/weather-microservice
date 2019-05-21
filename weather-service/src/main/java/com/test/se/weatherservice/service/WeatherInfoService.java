package com.test.se.weatherservice.service;

import com.test.se.weatherservice.config.WeatherFClientConfiguration;
import com.test.se.weatherservice.hystrix.WeatherInfoServiceFallback;
import com.test.se.weatherservice.response.WeatherInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "WeatherService",url = "http://api.apixu.com/v1/",configuration = {WeatherFClientConfiguration.class},fallback = WeatherInfoServiceFallback.class )
public interface WeatherInfoService {

    @GetMapping(value = "current.json")
    WeatherInfo fetchCurrentWeatherForTheCity(@RequestParam("key")String key, @RequestParam("q")String query);
}
