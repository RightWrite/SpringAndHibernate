package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
  public static void main(String[] args) {
    // Load spring configuration file
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    // Retrieve bean from container
    CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
    // call method on the bean
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortune());
    System.out.println(coach.getEmailAddress());
    System.out.println(coach.getTeam());
    // Close application context
    context.close();
  }
}
