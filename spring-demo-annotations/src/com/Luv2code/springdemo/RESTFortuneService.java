package com.Luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements  FortuneService{

  @Override
  public String getFortune() {
    return "REST";
  }
}
