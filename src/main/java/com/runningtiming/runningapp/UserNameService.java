package com.runningtiming.runningapp;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserNameService {
    private final UserNameRepository userNameRepository;

    public UserNameService(UserNameRepository userNameRepository) {
        this.userNameRepository = userNameRepository;
    }

    @Transactional
    public void add(UserNameDto newUser) {
        UserName userName = new UserName(newUser.getId(),
                newUser.getLogin(),
                newUser.getPassword(),
                newUser.getFirstname(),
                newUser.getLastname(),
                newUser.getBirthdate(),
                newUser.getGender());
        userNameRepository.save(userName);
    }

    @Transactional
    public void deleteById(Long id) {
        userNameRepository.deleteById(id);
    }
}
