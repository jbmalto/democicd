package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {

	@GetMapping("/")
	public String test(){
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

	echo "# democicd" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin git@github.com:jbmalto/democicd.git
	git push -u origin main

}
