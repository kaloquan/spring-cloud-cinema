package me.kaloquan.cinemauser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CinemaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaUserApplication.class, args);
	}
}
