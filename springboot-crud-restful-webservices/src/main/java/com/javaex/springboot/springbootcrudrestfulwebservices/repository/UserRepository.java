package com.javaex.springboot.springbootcrudrestfulwebservices.repository;

import com.javaex.springboot.springbootcrudrestfulwebservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
