package com.example.obej4_5y6;

import com.example.obej4_5y6.Entitis.Laptop;
import com.example.obej4_5y6.Repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class 	ObEj45y6Application {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(ObEj45y6Application.class, args);
		LaptopRepository repository=context.getBean(LaptopRepository.class);

		Laptop laptop1= new Laptop(null,"HP","XP210LC", 2015, 250000.99);
		Laptop laptop2= new Laptop(null,"Lenovo","ZT50LC", 2021, 450000.99);
		Laptop laptop3= new Laptop(null,"Dell","XP2LLÑ", 2013, 780000.99);
		Laptop laptop4= new Laptop(null,"Lenovo","XP2POQ9", 2023, 95000.99);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);
		repository.save(laptop4);
	}


}
