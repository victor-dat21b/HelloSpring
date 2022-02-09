package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/firstmapping")
    public String firstMapping(){
        return "Hello World";
    }

    @GetMapping("/")
    public String dankWay(){
        return "Default page";
    }

    @GetMapping("/parameter")
    public String parameter(@RequestParam String inddata){
        return inddata + " er dagens tekst.";

    }


}
