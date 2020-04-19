package com.example.shopdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.shopdemo.mapper")
public class ShopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopdemoApplication.class, args);
	}
}
