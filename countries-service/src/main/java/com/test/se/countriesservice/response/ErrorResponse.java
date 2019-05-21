package com.test.se.countriesservice.response;

public class ErrorResponse {
    public ErrorResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    private Object data;
}