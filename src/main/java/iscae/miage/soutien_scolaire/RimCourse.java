package iscae.miage.soutien_scolaire;

import iscae.miage.soutien_scolaire.dto.RegisterRequest;
import iscae.miage.soutien_scolaire.model.Role;
import iscae.miage.soutien_scolaire.service.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class RimCourse {

    public static void main(String[] args) {
        SpringApplication.run(RimCourse.class, args);
    }

@Bean
        public CommandLineRunner commandLineRunner(
                AuthenticationService service
	) {
            return args -> {

                var user = RegisterRequest.builder()
                        .firstname("iman")
                        .lastname("med")
                        .email("iman@mail.com")
                        .role(Role.ADMIN)
                        .build();
            };
        }

    }


