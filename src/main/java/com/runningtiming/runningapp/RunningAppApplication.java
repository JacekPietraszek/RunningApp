package com.runningtiming.runningapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunningAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RunningAppApplication.class, args);
        EventDto event1 = new EventDto(1L, "Półmaraton Kraśnik", "2023-10-08", "Kraśnik", "21km");
        EventDto event2 = new EventDto(2L, "Nocny półmaraton", "2023-09-03", "Warszawa", "21km");
        EventDto event3 = new EventDto(3L, "Praska piątka", "2023-09-03", "Warszawa", "5km");

        EventService eventService = context.getBean(EventService.class);
        eventService.add(event1);
        eventService.add(event2);
        eventService.add(event3);

        System.out.println(eventService.findAvailableEvent());

        System.out.println("Usuwam event numer 3.");
        eventService.deleteById(3L);

        System.out.println(eventService.findAvailableEvent());


    }

}
