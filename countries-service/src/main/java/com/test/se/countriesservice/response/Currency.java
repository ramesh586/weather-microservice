package com.test.se.countriesservice.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "name",
        "symbol"
})
public class Currency {

    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("symbol")
    private Object symbol;

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    @JsonProperty("symbol")
    public Object getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

}