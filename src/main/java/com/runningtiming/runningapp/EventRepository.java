package com.runningtiming.runningapp;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

interface EventRepository extends CrudRepository<Event, Long> {
    Optional<Event> findByEventId(Long eventId);
}
