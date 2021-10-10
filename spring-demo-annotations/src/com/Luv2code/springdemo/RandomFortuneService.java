package com.Luv2code.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

  String[] fortunes = {
    "Beware of the wolf in sheep's clothing",
    "Diligence is the mother of good luck",
    "The journey ois the reward"
  };
  private Random random=new Random();
  @Override
  public String getFortune() {
    return fortunes[random.nextInt(fortunes.length)];
  }
}
