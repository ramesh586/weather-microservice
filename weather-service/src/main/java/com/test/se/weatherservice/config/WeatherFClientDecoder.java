package com.test.se.weatherservice.config;


import com.test.se.weatherservice.exception.WeatherInfoNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus;

import java.io.IOException;

public class WeatherFClientDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        HttpStatus statusCode = HttpStatus.valueOf(response.status());
        String statusText = response.reason();

        String responseBody;
        try {
            responseBody = new String(IOUtils.toCharArray(response.body().asInputStream()));
        } catch (IOException e) {
            throw new RuntimeException("Failed to process response body.", e);
        }

        if (response.status() >= 400 && response.status() <= 499) {
            return new WeatherInfoNotFoundException(statusCode,statusText,responseBody);
        }
        return defaultErrorDecoder.decode(methodKey, response);
    }

}
