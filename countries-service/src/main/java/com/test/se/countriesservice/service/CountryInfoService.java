package com.test.se.countriesservice.service;

import com.test.se.countriesservice.config.CountriesFClientConfiguration;
import com.test.se.countriesservice.response.CountryInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CountryService", url = "https://restcountries.eu/rest/v2/",configuration = {CountriesFClientConfiguration.class})
public interface CountryInfoService {

    @GetMapping("currency/{currency}")
    List<CountryInfo> getCountryInfoByCurrency(@PathVariable("currency")String  currency);
}
