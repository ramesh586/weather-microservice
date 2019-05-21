package com.test.se.countriesservice.controller;

import com.test.se.countriesservice.response.CountryInfo;
import com.test.se.countriesservice.service.CountryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("v1/")
public class CountriesInfoController {

    @Autowired
    private CountryInfoService countryInfoSerive;

    @GetMapping("by-currency/{currency}")
    public ResponseEntity<Map<String,String>> getCountriesByCurrency(@PathVariable("currency")String currency){

        Map<String,String> listOfCountries=countryInfoSerive.getCountryInfoByCurrency(currency).stream()
                .collect(Collectors.toMap(CountryInfo::getName, CountryInfo::getCapital));
        return ResponseEntity.ok(listOfCountries);
    }
}
