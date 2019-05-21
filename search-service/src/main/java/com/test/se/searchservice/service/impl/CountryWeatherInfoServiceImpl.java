package com.test.se.searchservice.service.impl;

import com.test.se.searchservice.feign.client.CountryInfoServiceFClient;
import com.test.se.searchservice.feign.client.WeatherServiceFClient;
import com.test.se.searchservice.response.CountryWeatherInfoResponseBean;
import com.test.se.searchservice.service.CountryWeatherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryWeatherInfoServiceImpl implements CountryWeatherInfoService {

    @Autowired
    private CountryInfoServiceFClient countryInfoServiceFClient;

    @Autowired
    private WeatherServiceFClient weatherServiceFClient;


    @Override
    public List<CountryWeatherInfoResponseBean> getCountriesWeatherInfoByCurrency(String currency) {


        return countryInfoServiceFClient.getCountriesInfoByCurrency(currency)
                .orElseThrow(() -> new RuntimeException("No country exist for the currency"))
                .entrySet().stream().map(e -> {
                    CountryWeatherInfoResponseBean bean = new CountryWeatherInfoResponseBean();
                    bean.setCountryName(e.getKey());
                    bean.setCapitalName(e.getValue());
                    bean.setWeatherInfo(weatherServiceFClient.getWeatherInfoByCity(bean.getCapitalName()));
                    return bean;
                }).collect(Collectors.toList());
    }
}
