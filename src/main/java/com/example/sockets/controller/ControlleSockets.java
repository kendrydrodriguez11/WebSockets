package com.example.sockets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sockest")
public class ControlleSockets {
    @GetMapping("/set")
    public String setSockets(){
        return "hola";
    }
}
