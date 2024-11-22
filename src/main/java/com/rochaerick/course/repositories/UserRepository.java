package com.rochaerick.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rochaerick.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
