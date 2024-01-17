package org.launchcode.munchincrunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class MunchincrunchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MunchincrunchApplication.class, args);
	}

}