package com.example.obej4_5y6.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("api/Saludo")
    public String saludar(){
        return "Hola que tal!!";

    }
}
