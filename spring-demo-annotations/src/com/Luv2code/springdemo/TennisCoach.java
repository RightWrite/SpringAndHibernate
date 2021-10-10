package com.Luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component("tennisCoach")
@Component // generate  Default bean id when not specified
// @Scope("prototype")
public class TennisCoach implements Coach {

  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println(">>TennisCoach: inside doMyStartupStuff");
  }

  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println(">>TennisCoach: inside doMyCleanupStuff");
  }

  @Autowired
  @Qualifier("randomFortuneService")
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
