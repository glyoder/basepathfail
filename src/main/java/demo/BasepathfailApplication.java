package demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class BasepathfailApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasepathfailApplication.class, args);
	}

	@Entity
	public class Book {
		@Id
		private long id;
	}

	@RepositoryRestResource
	public interface BookRepo extends JpaRepository<BasepathfailApplication.Book, Long> {
	}

}