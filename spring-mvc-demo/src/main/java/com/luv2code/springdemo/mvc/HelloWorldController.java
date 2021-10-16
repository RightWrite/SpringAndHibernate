package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController {
  @GetMapping("/showForm")
  public String showForm() {
    return "helloworld-form";
  }

  @RequestMapping("/processForm")
  public String processFrom() {
    return "helloworld";
  }

  // new controller method to read form data and add data to the model
  @RequestMapping("/processFormVersionTwo")
  public String letsShoutDude(HttpServletRequest request, Model model) {
    // read the request parameter data from the html form
    String studentName = request.getParameter("studentName");
    // convert the data to all caps
    studentName = studentName.toUpperCase();
    // create a message
    String message = "Yo! " + studentName;

    // add message to the model
    model.addAttribute("message", message);

    return "helloworld";
  }

  @RequestMapping(value = "/processFormVersionThree", method = RequestMethod.GET)
  public String processFormVersionThree(@RequestParam("studentName") String theName,
      Model model) {
    theName = theName.toUpperCase();
    String message = "Hey my friends from v3! " + theName;
    model.addAttribute("message", message);
    return "helloworld";
  }
}
