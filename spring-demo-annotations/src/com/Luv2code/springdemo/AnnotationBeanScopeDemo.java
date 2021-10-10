package com.Luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
    TennisCoach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);
    boolean result = alphaCoach == theCoach;
    System.out.println("\n Pointing to the same object " + result);
    System.out.println("\n Memory location for theCoach" + theCoach);
    System.out.println("\n Memory location for alphaCoach" + alphaCoach);
  }
}
