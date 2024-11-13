package dev.luisrosales.contentcalendar;

import dev.luisrosales.contentcalendar.model.Content;
import dev.luisrosales.contentcalendar.model.Status;
import dev.luisrosales.contentcalendar.model.Type;
import dev.luisrosales.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		//return args -> System.out.println("Hello World");
		return args -> {
			// Todo: This is a great place to bootstrap and insert some data into the database
			Content content = new Content(null,
					"Hello Chat GPT ",
					"All about chat GPT",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");

			repository.save(content);
		};
	}

}
