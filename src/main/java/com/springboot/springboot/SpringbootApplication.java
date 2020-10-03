package com.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		System.out.println("teste");
		System.out.println("teste");
		System.out.println("teste");
		System.out.println("teste");
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	@RequestMapping("/home")
	public String index() {
		return "index";
	}

}
