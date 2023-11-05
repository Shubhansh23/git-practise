package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMavenAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMavenAppApplication.class, args);
	}


	public String welcomeMeg(){

		return "Welcome to Shubhansh Kingdom.....";
	}

}
