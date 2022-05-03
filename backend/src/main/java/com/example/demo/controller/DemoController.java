package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping()
    public String home() {
        return "Home";
    }

    @GetMapping("/nombre")
    public String nombre() {
        return "Esta parte de la aplicación se llama backend.";
    }

}
