package io.kole.security.jpasec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class JpaSecApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSecApplication.class, args);
	}

}
