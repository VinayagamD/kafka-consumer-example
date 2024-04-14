package com.vinaylogics.kafkaconsumerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.vinaylogics"})
public class KafkaConsumerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerExampleApplication.class, args);
	}

}
