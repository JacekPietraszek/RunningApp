package com.runningtiming.runningapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class UserName {
    @Id
    private Long id;
    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private String birthdate; //(YYYY-MM-DD)
    private char gender;

    public UserName() {

    }
}
