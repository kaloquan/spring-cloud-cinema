package me.kaloquan.cinemaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CinemaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaConsumerApplication.class, args);
	}
}
