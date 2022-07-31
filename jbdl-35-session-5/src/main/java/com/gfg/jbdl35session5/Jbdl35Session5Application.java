package com.gfg.jbdl35session5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class Jbdl35Session5Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Jbdl35Session5Application.class, args);
		ICalculator calculator = applicationContext.getBean(Calculator.class);
		log.info("output {}" , calculator.mul(2,3));
		calculator = applicationContext.getBean(Calculator2.class);
		log.info("output {}" , calculator.mul(2,3));

	}

}
