package com.bjike.goddess.secure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;


@SpringBootApplication
@ComponentScan(basePackages = {"com.bjike.goddess.secure.action", "com.bjike.goddess.secure.config", "com.bjike.goddess.common.consumer"})
@ImportResource("classpath:app.xml")
@EnableAutoConfiguration(exclude = {ValidationAutoConfiguration.class})
public class Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
        System.in.read();
    }

}
