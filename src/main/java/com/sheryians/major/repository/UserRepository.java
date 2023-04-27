package com.sheryians.major.repository;

import com.sheryians.major.model.User;
import org.hibernate.criterion.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User>findUserByEmail(String email);

}
