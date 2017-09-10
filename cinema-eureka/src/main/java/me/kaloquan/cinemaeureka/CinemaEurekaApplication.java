package me.kaloquan.cinemaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CinemaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaEurekaApplication.class, args);
	}
}
