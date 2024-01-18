package org.launchcode.munchincrunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories (basePackages = "org.launchcode.munchincrunch.data")
@EntityScan(basePackages = "org.launchcode.munchincrunch")
public class MunchincrunchApplication {
	public static void main(String[] args) {
		SpringApplication.run(MunchincrunchApplication.class, args);
	}

}