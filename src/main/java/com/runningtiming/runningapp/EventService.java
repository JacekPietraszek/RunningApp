package com.runningtiming.runningapp;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Transactional
    public void add(EventDto newEvent) {
        Event event = new Event(newEvent.getEventId(),
                newEvent.getName(),
                newEvent.getDateOfEvent(),
                newEvent.getPlace(),
                newEvent.getDistance());
        eventRepository.save(event);
    }

    @Transactional
    public void deleteById(Long eventId) {
        eventRepository.deleteById(eventId);
    }

    public List<EventDto> findAvailableEvent() {
        return eventRepository.findByEventId(3L)
                .stream().map(event -> new EventDto(
                        event.getEventId(),
                        event.getName(),
                        event.getDateOfEvent(),
                        event.getPlace(),
                        event.getDistance()
                )).collect(Collectors.toList());
    }
}
