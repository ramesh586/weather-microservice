package com.test.se.weatherservice;

import com.test.se.weatherservice.exception.WeatherInfoNotFoundException;
import com.test.se.weatherservice.response.WeatherInfo;
import com.test.se.weatherservice.service.WeatherInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WeatherServiceApplication.class)
@WebAppConfiguration
public class WeatherServiceTest {

    @Autowired
    private WeatherInfoService weatherInfoService;

    @Value("${weather.service.api.key}")
    private String weatherKey;

    @Test
    public void whenFetchCurrentWeatherForTheCityThenWeatherInfoNotNull(){
        WeatherInfo info=weatherInfoService.fetchCurrentWeatherForTheCity(weatherKey,"New York");
        Assert.assertNotNull(info);
        Assert.assertNull(info.getError());
    }

    @Test
    public void whenFetchCurrentWeatherForTheWrongCityThenWeatherInfoErrorShouldNotBeNull(){
        WeatherInfo info=weatherInfoService.fetchCurrentWeatherForTheCity(weatherKey,"abcdefghijklmnopqrstvu");
        Assert.assertNotNull(info);
        Assert.assertNotNull(info.getError());
    }

}
