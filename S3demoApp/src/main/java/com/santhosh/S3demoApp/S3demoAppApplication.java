package com.santhosh.S3demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.santhosh.S3demoApp")
public class S3demoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3demoAppApplication.class, args);
        System.out.println("Demo application started");
	}
}
