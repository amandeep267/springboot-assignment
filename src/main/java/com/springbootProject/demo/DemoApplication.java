package com.springbootProject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableAutoConfiguration(exclude= ErrorMvcAutoConfiguration.class)
@SpringBootApplication
//@ComponentScan("com")
public class DemoApplication  {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
