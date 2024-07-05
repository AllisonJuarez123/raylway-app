package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreController {

    @GetMapping("/mi-nombre")
    public String getNombre() {
        return "Allison";
    }
}
