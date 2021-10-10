package com.Luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component("tennisCoach")
@Component // generate  Default bean id when not specified
public class TennisCoach implements Coach {

  @Autowired
  private FortuneService fortuneService;

  public TennisCoach() {
    System.out.println(">> TennisCoach - inside default constructor");
  }
  //  @Autowired
  //  public TennisCoach(FortuneService fortuneService) {
  //    this.fortuneService = fortuneService;
  //  }

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

//  @Autowired
//  public void setFortuneService(FortuneService fortuneService) {
//    System.out.println(">> TennisCoach : Inside setFortuneService method ");
//    this.fortuneService = fortuneService;
//  }

//  @Autowired
//  public void doSomeCrazyStuff(FortuneService fortuneService) {
//    System.out.println(">> TennisCoach : Inside doSomeCrazyStuff method ");
//    this.fortuneService = fortuneService;
//  }


}
