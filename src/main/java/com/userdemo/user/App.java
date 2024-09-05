package com.userdemo.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class App {
    public static void main(String[] args) {
    }
    @GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring boot users ";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "greetings from spring boot users ";
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello from spring boot users ";
	}
    
}
