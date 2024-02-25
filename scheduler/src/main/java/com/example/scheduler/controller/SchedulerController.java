package com.example.scheduler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerController {

    @GetMapping("/")
    public String indexStr(){
        return "index";
    }
}
