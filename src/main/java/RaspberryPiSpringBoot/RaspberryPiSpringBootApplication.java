package RaspberryPiSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RaspberryPiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaspberryPiSpringBootApplication.class, args);
		System.out.println("Running");
	}

}
