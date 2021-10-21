package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
  private String firstName;
  private String lastName;
  private String country;
  private ArrayList<String> operatingSystems;
  private String favoriteLanguage;

  private LinkedHashMap<String, String> favoriteLanguageOptions;
  private LinkedHashMap<String, String> countryOptions;
  private ArrayList<String> operatingSystemOptions;

  public Student() {
    countryOptions = new LinkedHashMap<>();
    countryOptions.put("IN", "India");
    countryOptions.put("UK", "United Kingdom");
    countryOptions.put("USA", "United States of America");
    countryOptions.put("BR", "Brazil");

    // populate favorite language options
    favoriteLanguageOptions = new LinkedHashMap<>();
    // parameter order: value, display label
    //
    favoriteLanguageOptions.put("Java", "Java");
    favoriteLanguageOptions.put("C#", "C#");
    favoriteLanguageOptions.put("PHP", "PHP");
    favoriteLanguageOptions.put("Ruby", "Ruby");

    operatingSystemOptions = new ArrayList<>();
    operatingSystemOptions.add("Linux");
    operatingSystemOptions.add("Windows");
    operatingSystemOptions.add("Mac");
  }
}
