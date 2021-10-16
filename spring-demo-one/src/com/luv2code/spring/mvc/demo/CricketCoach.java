package com.luv2code.spring.mvc.demo;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;

  private String emailAddress;
  private String team;

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 min.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("CricketCoach -  Inside setter method - setFortuneService");
    this.fortuneService = fortuneService;
  }

  public void setEmailAddress(String emailAddress) {
    System.out.println("CricketCoach -  Inside setter method - setEmailAddress");
    this.emailAddress = emailAddress;
  }

  public void setTeam(String team) {
    System.out.println("CricketCoach -  Inside setter method - setTeam");
    this.team = team;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String getTeam() {
    return team;
  }
}
