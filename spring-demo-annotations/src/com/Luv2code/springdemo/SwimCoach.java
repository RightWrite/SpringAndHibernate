package com.Luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {

  @Value("${foo.email}")
  private String email;

  @Value("${foo.team}")
  private String team;

  private FortuneService fortuneService;

  public SwimCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Swim 1000m as a warm up";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  public String getEmail() {
    return email;
  }

  public String getTeam() {
    return team;
  }
}
