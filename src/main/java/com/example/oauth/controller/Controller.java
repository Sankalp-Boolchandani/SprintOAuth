package com.example.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/public")
    public String publicController(){
        return "PUBLIC CONTROLLER";
    }

    @GetMapping("/private")
    public String privateController(){
        return "PRIVATE CONTROLLER";
    }

}
