package com.thorabh.samplejenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleJenkinsApplication.class, args);
	}

	@GetMapping("/test")
	public String res()
	{
		return "App Test Working";
	}

}
