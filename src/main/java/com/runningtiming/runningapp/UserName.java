package com.runningtiming.runningapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


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

    public UserName(Long id, String login, String password, String firstname, String lastname, String birthdate, char gender) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserName{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender=" + gender +
                '}';
    }
}
