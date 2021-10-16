package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/funny")
public class SillyController {


    @GetMapping("/showForm")
    public String displayTheForm() {
        return "silly";
    }


}
