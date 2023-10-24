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
        EventDto event4 = new EventDto(4L, "Lekka piątka", "2023-03-26", "Warszawa", "5km");
        EventDto event5 = new EventDto(5L, "Półmaraton Kraśnik", "2022-10-01", "Kraśnik", "21km");
        EventDto event6 = new EventDto(6L, "Lubelska Dycha", "2021-06-15", "Lublin", "10km");
        EventDto event7 = new EventDto(7L, "Bieg niepodległości", "2023-11-10", "Warszawa", "10km");


        EventService eventService = context.getBean(EventService.class);
        eventService.add(event1);
        eventService.add(event2);
        eventService.add(event3);
        eventService.add(event4);
        eventService.add(event5);
        eventService.add(event6);
        eventService.add(event7);

        System.out.println(eventService.findAvailableEvent());

        System.out.println("Usuwam event numer 3.");
        eventService.deleteById(3L);

        System.out.println(eventService.findAvailableEvent());


    }

}
