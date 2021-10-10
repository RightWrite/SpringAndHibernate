package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

  private FortuneService fortuneService;

  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5K";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  private void doMyStartupStuff() {
    System.out.println("TrackCoach: Inside method - doMyStartupStuff. ");
  }

  private void doMyCleanupStuffYoyo() {
    System.out.println("TrackCoach: Inside method - doMyCleanupStuffYoyo.");
  }

  // add a destroy method
  @Override
  public void destroy() throws Exception {
    doMyCleanupStuffYoyo();
  }
}
