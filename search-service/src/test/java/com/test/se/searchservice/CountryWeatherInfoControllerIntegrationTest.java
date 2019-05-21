package com.test.se.searchservice;


import com.test.se.searchservice.response.CountryWeatherInfoResponseBean;
import com.test.se.searchservice.service.CountryWeatherInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

import java.util.Collections;

import static io.restassured.RestAssured.get;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CountryWeatherInfoControllerIntegrationTest {

    private final String VERSION_PREFIX="/v1/";

    @PostConstruct
    public void init() {
        uri = "http://localhost:" + port+VERSION_PREFIX;
    }

    @MockBean
    private CountryWeatherInfoService countryWeatherInfoService;

    @LocalServerPort
    private int port;

    private String uri;

    @Test
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {

        CountryWeatherInfoResponseBean countryWeatherInfoResponseBean=new CountryWeatherInfoResponseBean();
        countryWeatherInfoResponseBean.setWeatherInfo("Capital weather ");
        countryWeatherInfoResponseBean.setCapitalName("New york");
        countryWeatherInfoResponseBean.setCountryName("United State Of America");
        String currency="USD";
        Mockito.when(countryWeatherInfoService.getCountriesWeatherInfoByCurrency(currency)).thenReturn(Collections.singletonList(countryWeatherInfoResponseBean));
        get(uri+"by-currency/"+currency).then().assertThat().statusCode(200);
    }
}
