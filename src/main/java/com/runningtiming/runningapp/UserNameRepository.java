package com.runningtiming.runningapp;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public class UserNameRepository {
    private final EntityManager entityManager;

    public UserNameRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(UserName username) {
        entityManager.persist(username);
    }

    public Optional<UserName> findById(Long id) {
        return Optional.ofNullable(entityManager.find(UserName.class, id));
    }

    @Transactional
    public void deleteById(Long id) {
        findById(id).ifPresent(entityManager::remove);
    }
}
