package com.example.olamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OlamundoApplication {

	@RequestMapping("/contratos-dev/hello")
	String dev(){
		return "Olá Mundo (para devs!)";
	}

	@RequestMapping("/contratos/hello")
	String prod(){
		return "Olá Mundo!";
	}

	public static void main(String[] args) {
		SpringApplication.run(OlamundoApplication.class, args);
	}

}
