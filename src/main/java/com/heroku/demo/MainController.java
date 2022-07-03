package com.heroku.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class MainController {

    @Autowired
    GreetinService greetinService;

    @GetMapping()
    public String hello(@RequestParam(name = "lang") String lang) {
        return greetinService.getGreeting(lang);
    }
}
