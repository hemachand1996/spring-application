package src.main.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import src.main.repository.StudentRepository;

@SpringBootApplication()
@ComponentScan("src.main.*")
@EnableMongoRepositories(basePackageClasses=StudentRepository.class)
public class Application {
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}
}
