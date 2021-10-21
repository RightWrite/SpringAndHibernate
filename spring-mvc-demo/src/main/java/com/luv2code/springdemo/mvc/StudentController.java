package com.luv2code.springdemo.mvc;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

  @RequestMapping(value = "showForm", method = GET)
  public String showForm(Model model) {
    Student student = new Student();
    model.addAttribute("student", student);
    return "student-form";
  }

  @RequestMapping(value = "processForm",method = POST)
  public String processForm(@ModelAttribute("student") Student  student){
    System.out.println(student.toString());
  return "student-confirmation";
  }
}
