package com.hospitalmgmt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hospitalmngmt.*")
public class HosMain {

		public static void main(String[] args) {
			SpringApplication.run(HosMain.class, args);
		}

	}
