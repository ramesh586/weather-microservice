package com.test.se.weatherservice.exception.handler;

import com.test.se.weatherservice.exception.WeatherInfoNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SuperExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(WeatherInfoNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(WeatherInfoNotFoundException ex, WebRequest request) {

        return new ResponseEntity<>(ex.getResponseBody(), ex.getStatus());
    }
}
