package com.bnta.hello_world.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // in spring annotations can take params

    @GetMapping("/greeting") // takes in an argument (what root do you want me to do someting on"
    // when it hears greeting it will fire the method.
    // you don't need the () after @RequestParam, but by giving one it will give a default value
    public String greeting(@RequestParam(defaultValue = "world") String name){ // localhost:8080/greeting?name=Tarek
        return "Hello " + name;//Hello Tarek
    }


}
