package com.manoellima.studying_spring.repositories;

import com.manoellima.studying_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Type, ID>
public interface UserRepository extends JpaRepository<User, Long> {

}