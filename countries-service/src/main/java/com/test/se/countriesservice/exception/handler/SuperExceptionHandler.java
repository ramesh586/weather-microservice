package com.test.se.countriesservice.exception.handler;

import com.test.se.countriesservice.exception.BadRequestException;
import com.test.se.countriesservice.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class SuperExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(BadRequestException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(BadRequestException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getResponseBody(), ex.getStatus());
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(ex.getMessage(), details);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
