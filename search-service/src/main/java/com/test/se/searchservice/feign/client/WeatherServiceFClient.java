package com.test.se.searchservice.feign.client;

import com.test.se.searchservice.feign.config.WeatherFClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "weather-service/v1/",configuration = {WeatherFClientConfiguration.class})
public interface WeatherServiceFClient {

    @GetMapping("search-by-city")
    String getWeatherInfoByCity(@RequestParam("city")String city);
}
