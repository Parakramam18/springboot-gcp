package com.raj.restwsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class RestwsspringbootApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(RestwsspringbootApplication.class, args);
    }

}
