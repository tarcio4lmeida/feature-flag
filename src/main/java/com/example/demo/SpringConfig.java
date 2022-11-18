package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	@ConditionalOnProperty(
			name = "feature-flag.csv-enabled",
			havingValue="true",
			matchIfMissing = true
	)
	public Services csvService(){
		return new CsvService();
	}


	@Bean
	@ConditionalOnProperty(
			name = "feature-flag.kafka-enabled",
			havingValue="true",
			matchIfMissing = true
	)
	public Services kafkaService(){
		return new KafkaService();
	}

}