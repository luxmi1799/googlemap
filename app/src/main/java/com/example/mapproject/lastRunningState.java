package com.example.mapproject;

 class LastRunningState {


    private Integer truckId;

    private Long stopStartTime;

    private Integer truckRunningState;

    private Double lat;

    private Double lng;

    private Integer stopNotficationSent;

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public Long getStopStartTime() {
        return stopStartTime;
    }

    public void setStopStartTime(Long stopStartTime) {
        this.stopStartTime = stopStartTime;
    }

    public Integer getTruckRunningState() {
        return truckRunningState;
    }

    public void setTruckRunningState(Integer truckRunningState) {
        this.truckRunningState = truckRunningState;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Integer getStopNotficationSent() {
        return stopNotficationSent;
    }

    public void setStopNotficationSent(Integer stopNotficationSent) {
        this.stopNotficationSent = stopNotficationSent;
    }

}
