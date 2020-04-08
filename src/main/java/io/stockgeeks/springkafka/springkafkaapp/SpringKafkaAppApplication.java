package io.stockgeeks.springkafka.springkafkaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableKafka
@SpringBootApplication
public class SpringKafkaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringKafkaAppApplication.class, args);
		SimpleProducer bean = run.getBean(SimpleProducer.class);
		bean.send("test kafki ;)");

	}

}
