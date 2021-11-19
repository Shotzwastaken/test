package com.example.researchtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class researchtestapp {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World Developer!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(researchtestapp.class, args);

    }

}
