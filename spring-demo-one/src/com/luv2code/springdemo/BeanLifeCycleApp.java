package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {
  public static void main(String[] args) {
    // Load spring configuration file
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
    // Retrieve bean from container
    Coach theCoach = context.getBean("theCoach", TrackCoach.class);
    Coach alphaCoach = context.getBean("myCoach", TrackCoach.class);
    // call method on the bean
    System.out.println(theCoach.getDailyFortune());
    System.out.println(alphaCoach.getDailyFortune());
    System.out.println("Pointing to the same object " + (theCoach == alphaCoach));
    // Close application context
    context.close();
  }
}
