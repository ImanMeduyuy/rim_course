package iscae.miage.soutien_scolaire.repository;

import java.util.Optional;

import iscae.miage.soutien_scolaire.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}

