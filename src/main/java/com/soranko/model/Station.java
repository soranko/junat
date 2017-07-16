package com.soranko.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by kallesoranko on 11/07/2017.
 */
public class Station {

    @JsonProperty("stationShortCode")
    private String stationShortCode;
    @JsonProperty("stationUICCode")
    private int stationUICCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("type")
    private String type;
    @JsonProperty("trainStopping")
    private boolean trainStopping;
    @JsonProperty("commercialStop")
    private boolean commercialStop;
    @JsonProperty("commercialTrack")
    private String commercialTrack;
    @JsonProperty("cancelled")
    private boolean cancelled;
    @JsonProperty("scheduledTime")
    private Date scheduledTime;         //"2017-07-15T15:00:00.000Z",
    @JsonProperty("actualTime")
    private Date actualTime;            //"2017-07-15T15:00:56.000Z",
    @JsonProperty("differenceInMinutes")
    private int differenceInMinutes;
    @JsonProperty("causes")
    private String[] causes;
    @JsonProperty("trainReady")
    private List<TrainReady> trainReady;


    // No-arg constructor
    public Station() {

    }

    // Properties //
    public String getStationShortCode() {
        return stationShortCode;
    }

    public void setStationShortCode(String stationShortCode) {
        this.stationShortCode = stationShortCode;
    }

    public int getStationUICCode() {
        return stationUICCode;
    }

    public void setStationUICCode(int stationUICCode) {
        this.stationUICCode = stationUICCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isTrainStopping() {
        return trainStopping;
    }

    public void setTrainStopping(boolean trainStopping) {
        this.trainStopping = trainStopping;
    }

    public boolean isCommercialStop() {
        return commercialStop;
    }

    public void setCommercialStop(boolean commercialStop) {
        this.commercialStop = commercialStop;
    }

    public String getCommercialTrack() {
        return commercialTrack;
    }

    public void setCommercialTrack(String commercialTrack) {
        this.commercialTrack = commercialTrack;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Date getActualTime() {
        return actualTime;
    }

    public void setActualTime(Date actualTime) {
        this.actualTime = actualTime;
    }

    public int getDifferenceInMinutes() {
        return differenceInMinutes;
    }

    public void setDifferenceInMinutes(int differenceInMinutes) {
        this.differenceInMinutes = differenceInMinutes;
    }

    public String[] getCauses() {
        return causes;
    }

    public void setCauses(String[] causes) {
        this.causes = causes;
    }

    public List<TrainReady> getTrainReady() {
        return trainReady;
    }

    public void setTrainReady(List<TrainReady> trainReady) {
        this.trainReady = trainReady;
    }
}
