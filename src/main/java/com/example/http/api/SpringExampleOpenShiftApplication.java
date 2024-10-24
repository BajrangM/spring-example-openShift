package com.example.http.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringExampleOpenShiftApplication {
	
	@GetMapping("/")
  public String  welcome() {
	return "welcome to java";
}
	
	@GetMapping("/{input}")
	  public String  congrats(@PathVariable String  input) {
		return " Hi " + input+ "Ypur Application is deployed succesfully" ;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleOpenShiftApplication.class, args);
	}

}
