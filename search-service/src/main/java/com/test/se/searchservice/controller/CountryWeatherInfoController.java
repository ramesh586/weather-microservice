package com.test.se.searchservice.controller;

import com.test.se.searchservice.response.CountryWeatherInfoResponseBean;
import com.test.se.searchservice.service.CountryWeatherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/")
public class CountryWeatherInfoController {

    @Autowired
    private CountryWeatherInfoService countryWeatherInfoService;

    @GetMapping("by-currency/{currency}")
    public ResponseEntity<List<CountryWeatherInfoResponseBean>> getCountriesWeatherInfoByCurrency(@PathVariable("currency")String currency){

        return ResponseEntity.ok(countryWeatherInfoService.getCountriesWeatherInfoByCurrency(currency));
    }
}
