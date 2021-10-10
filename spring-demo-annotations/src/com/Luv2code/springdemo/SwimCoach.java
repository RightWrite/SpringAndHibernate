package com.Luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

  @Value("${foo.email}")
  private String email;

  @Autowired
  @Qualifier("RESTFortuneService")
  private FortuneService fortuneService;

  @Override
  public String getDailyWorkout() {
    return "Try butterfly dive today";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  public String getEmail() {
    return email;
  }
}
