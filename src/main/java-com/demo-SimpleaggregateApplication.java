/*
    Generated by Atomist on 05 07 2016 
*/
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SimpleaggregateApplication {

	@RequestMapping("/")
    public String home() {
        return this.toString() + " instance saying: Hello Microservice World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleaggregateApplication.class, args);
    }
}