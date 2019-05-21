package com.test.se.searchservice.service;

import com.test.se.searchservice.response.CountryWeatherInfoResponseBean;

import java.util.List;

public interface CountryWeatherInfoService {

    List<CountryWeatherInfoResponseBean> getCountriesWeatherInfoByCurrency(String currency);
}
