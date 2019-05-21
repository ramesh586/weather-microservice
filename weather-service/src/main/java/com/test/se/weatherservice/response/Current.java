package com.test.se.weatherservice.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Current {

    @JsonProperty("last_updated_epoch")
    private Integer lastUpdatedEpoch;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("temp_c")
    private Integer tempC;
    @JsonProperty("temp_f")
    private Integer tempF;
    @JsonProperty("is_day")
    private Integer isDay;
    @JsonProperty("condition")
    private Condition condition;
    @JsonProperty("wind_mph")
    private Double windMph;
    @JsonProperty("wind_kph")
    private Integer windKph;
    @JsonProperty("wind_degree")
    private Integer windDegree;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("pressure_mb")
    private Integer pressureMb;
    @JsonProperty("pressure_in")
    private Double pressureIn;
    @JsonProperty("precip_mm")
    private Integer precipMm;
    @JsonProperty("precip_in")
    private Integer precipIn;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonProperty("cloud")
    private Integer cloud;
    @JsonProperty("feelslike_c")
    private Double feelslikeC;
    @JsonProperty("feelslike_f")
    private Double feelslikeF;
    @JsonProperty("vis_km")
    private Integer visKm;
    @JsonProperty("vis_miles")
    private Integer visMiles;
    @JsonProperty("uv")
    private Integer uv;
    @JsonProperty("gust_mph")
    private Double gustMph;
    @JsonProperty("gust_kph")
    private Double gustKph;

    @JsonProperty("last_updated_epoch")
    public Integer getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    @JsonProperty("last_updated_epoch")
    public void setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("temp_c")
    public Integer getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(Integer tempC) {
        this.tempC = tempC;
    }

    @JsonProperty("temp_f")
    public Integer getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    public void setTempF(Integer tempF) {
        this.tempF = tempF;
    }

    @JsonProperty("is_day")
    public Integer getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @JsonProperty("wind_mph")
    public Double getWindMph() {
        return windMph;
    }

    @JsonProperty("wind_mph")
    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    @JsonProperty("wind_kph")
    public Integer getWindKph() {
        return windKph;
    }

    @JsonProperty("wind_kph")
    public void setWindKph(Integer windKph) {
        this.windKph = windKph;
    }

    @JsonProperty("wind_degree")
    public Integer getWindDegree() {
        return windDegree;
    }

    @JsonProperty("wind_degree")
    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("pressure_mb")
    public Integer getPressureMb() {
        return pressureMb;
    }

    @JsonProperty("pressure_mb")
    public void setPressureMb(Integer pressureMb) {
        this.pressureMb = pressureMb;
    }

    @JsonProperty("pressure_in")
    public Double getPressureIn() {
        return pressureIn;
    }

    @JsonProperty("pressure_in")
    public void setPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
    }

    @JsonProperty("precip_mm")
    public Integer getPrecipMm() {
        return precipMm;
    }

    @JsonProperty("precip_mm")
    public void setPrecipMm(Integer precipMm) {
        this.precipMm = precipMm;
    }

    @JsonProperty("precip_in")
    public Integer getPrecipIn() {
        return precipIn;
    }

    @JsonProperty("precip_in")
    public void setPrecipIn(Integer precipIn) {
        this.precipIn = precipIn;
    }

    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("cloud")
    public Integer getCloud() {
        return cloud;
    }

    @JsonProperty("cloud")
    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    @JsonProperty("feelslike_c")
    public Double getFeelslikeC() {
        return feelslikeC;
    }

    @JsonProperty("feelslike_c")
    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    @JsonProperty("feelslike_f")
    public Double getFeelslikeF() {
        return feelslikeF;
    }

    @JsonProperty("feelslike_f")
    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    @JsonProperty("vis_km")
    public Integer getVisKm() {
        return visKm;
    }

    @JsonProperty("vis_km")
    public void setVisKm(Integer visKm) {
        this.visKm = visKm;
    }

    @JsonProperty("vis_miles")
    public Integer getVisMiles() {
        return visMiles;
    }

    @JsonProperty("vis_miles")
    public void setVisMiles(Integer visMiles) {
        this.visMiles = visMiles;
    }

    @JsonProperty("uv")
    public Integer getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(Integer uv) {
        this.uv = uv;
    }

    @JsonProperty("gust_mph")
    public Double getGustMph() {
        return gustMph;
    }

    @JsonProperty("gust_mph")
    public void setGustMph(Double gustMph) {
        this.gustMph = gustMph;
    }

    @JsonProperty("gust_kph")
    public Double getGustKph() {
        return gustKph;
    }

    @JsonProperty("gust_kph")
    public void setGustKph(Double gustKph) {
        this.gustKph = gustKph;
    }

}