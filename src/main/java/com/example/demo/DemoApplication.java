package com.example.demo;

import com.example.demo.domain.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * 在@SpringBootApplication中有@SpringBootConfiguration，
	 * 而@SpringBootConfiguration有@Configuration，所以可以在这里使用@bean注入
	 * @return
	 */
	@Bean
	public A a() {
		return new A();
	}

}
