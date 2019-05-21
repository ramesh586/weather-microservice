package com.test.se.countriesservice.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends RuntimeException {


    private HttpStatus status;


    private String message;


    private String responseBody;


    public BadRequestException(HttpStatus statusCode, String message, String responseBody){
        super(message);
        this.status=statusCode;
        this.message=message;
        this.responseBody=responseBody;
    }

    public String getResponseBody() {
        return responseBody;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
