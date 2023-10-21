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
    private String description;

    public Event() {
    }
}
