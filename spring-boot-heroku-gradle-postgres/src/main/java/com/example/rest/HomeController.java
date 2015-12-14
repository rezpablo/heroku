package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class HomeController {

    @RequestMapping(value =  "springao")
    public String home() {
        return "home";
    }

}
