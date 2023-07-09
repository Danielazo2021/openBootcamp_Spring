package com.example.obej4_5y6.Controllers;

import com.example.obej4_5y6.Entitis.Laptop;
import com.example.obej4_5y6.Repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LaptopController {
    private

    LaptopRepository laptopRepository;
    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository= laptopRepository;
    }

    @GetMapping("api/laptops")
    public List<Laptop> getLaptops() {
        return laptopRepository.findAll();
    }

    @PostMapping("api/laptops")
    public Laptop grabarLaptop(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);

    }
}
