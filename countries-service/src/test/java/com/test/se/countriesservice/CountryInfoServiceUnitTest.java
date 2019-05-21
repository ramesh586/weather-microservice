package com.test.se.countriesservice;

import com.test.se.countriesservice.exception.BadRequestException;
import com.test.se.countriesservice.response.CountryInfo;
import com.test.se.countriesservice.service.CountryInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryInfoServiceUnitTest {

    @Autowired
    private CountryInfoService countryInfoSerive;

    @Test
    public void whenGetCountryInfoByCurrencyThenListShouldNotBeEmpty(){
        List<CountryInfo> countryInfos=countryInfoSerive.getCountryInfoByCurrency("USD");
        Assert.assertFalse(countryInfos.isEmpty());
    }

    @Test
    public void whenGetCountryInfoByCurrencyINRThenListSizeShouldBeThree(){
        List<CountryInfo> countryInfos=countryInfoSerive.getCountryInfoByCurrency("INR");
        Assert.assertEquals(3,countryInfos.size());
    }

    @Test(expected = BadRequestException.class)
    public void whenGetCountryInfoByCurrencyThenListShouldBeEmpty(){
        List<CountryInfo> countryInfos=countryInfoSerive.getCountryInfoByCurrency("USSDDSD");
        Assert.assertTrue(countryInfos.isEmpty());
    }
}
