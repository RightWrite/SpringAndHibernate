package com.Luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
    System.out.println(tennisCoach.getDailyWorkout());
    System.out.println(tennisCoach.getDailyFortune());
    SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
    System.out.println(swimCoach.getDailyWorkout());
    System.out.println(swimCoach.getDailyFortune());
    System.out.println(swimCoach.getEmail());
    context.close();
  }
}
