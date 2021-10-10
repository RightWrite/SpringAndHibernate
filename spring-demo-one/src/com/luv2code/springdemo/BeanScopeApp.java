package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
  public static void main(String[] args) {
    // Load spring configuration file
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
    // Retrieve bean from container
    BaseballCoach theCoach = context.getBean("theCoach", BaseballCoach.class);
    BaseballCoach alphaCoach = context.getBean("theCoach", BaseballCoach.class);
    // call method on the bean
    System.out.println("Pointing to the same object " + (theCoach == alphaCoach));
    // Close application context
    context.close();
  }
}
