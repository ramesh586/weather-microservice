package com.test.se.searchservice.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;
import java.util.Optional;

@FeignClient("countries-service/v1/")
public interface CountryInfoServiceFClient {

    @GetMapping("by-currency/{currency}")
    Optional<Map<String,String>> getCountriesInfoByCurrency(@PathVariable("currency")String currency);
}
