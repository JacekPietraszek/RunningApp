package com.runningtiming.runningapp;

public class EventDto {
    private Long eventId;
    private String name;
    private String dateOfEvent; //(YYYY-MM-DD)
    private String place;
    private String distance;

    public EventDto(Long eventId, String name, String dateOfEvent, String place, String distance) {
        this.eventId = eventId;
        this.name = name;
        this.dateOfEvent = dateOfEvent;
        this.place = place;
        this.distance = distance;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "EventDto{" +
                "eventId=" + eventId +
                ", name='" + name + '\'' +
                ", dateOfEvent='" + dateOfEvent + '\'' +
                ", place='" + place + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }
}
