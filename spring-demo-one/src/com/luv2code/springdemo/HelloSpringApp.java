package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

  public static void main(String[] args) {
    // Load spring config file
    ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

    // Retrieve bean from container
    Coach coach=context.getBean("theCoach",Coach.class);
    // call method on the bean
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortune());
    // Close application context
    context.close();

  }
}
