package com.test.se.weatherservice.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class WeatherInfo {

    @JsonProperty("location")
    private Location location;
    @JsonProperty("current")
    private Current current;

    @JsonProperty("error")
    private Error error;

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(Current current) {
        this.current = current;
    }

    @JsonProperty("error")
    public Error getError() {
        return error;
    }
    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
    }
}