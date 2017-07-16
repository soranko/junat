package com.soranko.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by kallesoranko on 11/07/2017.
 */
public class Train {

    @JsonProperty("trainNumber")
    private int trainNumber;
    @JsonProperty("departureDate")
    private Date departureDate;
    @JsonProperty("operatorUICCode")
    private int operatorUICCode;
    @JsonProperty("operatorShortCode")
    private String operatorShortCode;
    @JsonProperty("trainType")
    private String trainType;
    @JsonProperty("trainCategory")
    private String trainCategory;
    @JsonProperty("commuterLineID")
    private String commuterLineID;
    @JsonProperty("runningCurrently")
    private boolean runningCurrently;
    @JsonProperty("cancelled")
    private boolean cancelled;
    @JsonProperty("version")
    private Long version;
    @JsonProperty("timetableType")
    private String timetableType;
    @JsonProperty("timetableAcceptanceDate")
    private Date timetableAcceptanceDate;  //"2017-05-26T15:37:01.000Z"
    @JsonProperty("timeTableRows")
    private List<Station> timeTableRows;

    // No-arg constructor //
    public Train() {
    }

    public Train(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Train(int trainNumber, String trainCategory) {
        this.trainNumber = trainNumber;
        this.trainCategory = trainCategory;
    }

    // Properties //
    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getOperatorUICCode() {
        return operatorUICCode;
    }

    public void setOperatorUICCode(int operatorUICCode) {
        this.operatorUICCode = operatorUICCode;
    }

    public String getOperatorShortCode() {
        return operatorShortCode;
    }

    public void setOperatorShortCode(String operatorShortCode) {
        this.operatorShortCode = operatorShortCode;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getTrainCategory() {
        return trainCategory;
    }

    public void setTrainCategory(String trainCategory) {
        this.trainCategory = trainCategory;
    }

    public String getCommuterLineID() {
        return commuterLineID;
    }

    public void setCommuterLineID(String commuterLineID) {
        this.commuterLineID = commuterLineID;
    }

    public boolean isRunningCurrently() {
        return runningCurrently;
    }

    public void setRunningCurrently(boolean runningCurrently) {
        this.runningCurrently = runningCurrently;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getTimetableType() {
        return timetableType;
    }

    public void setTimetableType(String timetableType) {
        this.timetableType = timetableType;
    }

    public Date getTimetableAcceptanceDate() {
        return timetableAcceptanceDate;
    }

    public void setTimetableAcceptanceDate(Date timetableAcceptanceDate) {
        this.timetableAcceptanceDate = timetableAcceptanceDate;
    }

    public List<Station> getTimeTableRows() {
        return timeTableRows;
    }

    public void setTimeTableRows(List<Station> timeTableRows) {
        this.timeTableRows = timeTableRows;
    }
}
