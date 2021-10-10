package com.Luv2code.springdemo;

import org.springframework.stereotype.Component;

//@Component("tennisCoach")
@Component  // generate  Default bean id when not specified
public class TennisCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }
}
