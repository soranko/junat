package com.soranko.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by kallesoranko on 16/07/2017.
 */
public class TrainReady {

    @JsonProperty("source")
    private String source;
    @JsonProperty("accepted")
    private boolean accepted;
    @JsonProperty("timestamp")
    private Date timestamp;         //2017-07-15T14:57:24.000Z;

    // No-arg constructor //
    TrainReady() { }

    // Properties //
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
