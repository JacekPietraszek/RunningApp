package com.runningtiming.runningapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunningAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RunningAppApplication.class, args);
        UserName userName1 = new UserName(1L, "JacekTRI", "Jacek123!#", "Jacek", "Pietraszek", "2001-11-06", 'M');
        UserNameRepository userNameRepository1 = context.getBean(UserNameRepository.class);
        userNameRepository1.save(userName1);
        UserName userName2 = new UserName(2L, "NataliaTRI", "Natalia123!#", "Natalia", "Kołodziej", "2001-01-26", 'F');
        UserNameRepository userNameRepository2 = context.getBean(UserNameRepository.class);
        userNameRepository2.save(userName2);

    }

}
