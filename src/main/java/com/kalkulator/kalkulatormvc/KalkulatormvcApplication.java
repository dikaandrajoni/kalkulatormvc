package com.kalkulator.kalkulatormvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.kalkulator.kalkulatormvc"})
public class KalkulatormvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalkulatormvcApplication.class, args);
	}

}
