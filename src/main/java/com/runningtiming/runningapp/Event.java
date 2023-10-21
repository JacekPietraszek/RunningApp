package com.runningtiming.runningapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    private Long eventId;
    private String name;
    private String dateOfEvent; //(YYYY-MM-DD)
    private String place;
    private String distance;

    public Event() {
    }

    public Event(Long eventId, String name, String dateOfEvent, String place, String distance) {
        this.eventId = eventId;
        this.name = name;
        this.dateOfEvent = dateOfEvent;
        this.place = place;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", name='" + name + '\'' +
                ", dateOfEvent='" + dateOfEvent + '\'' +
                ", place='" + place + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }
}
