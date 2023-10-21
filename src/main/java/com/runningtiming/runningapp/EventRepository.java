package com.runningtiming.runningapp;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public class EventRepository {
    private final EntityManager entityManager;

    public EventRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(Event event) {
        entityManager.persist(event);
    }

    public Optional<Event> findById (Long eventId) {
        return Optional.ofNullable(entityManager.find(Event.class, eventId));
    }

    @Transactional
    public void deleteById(Long eventId) {
        findById(eventId).ifPresent(entityManager::remove);
    }
}
