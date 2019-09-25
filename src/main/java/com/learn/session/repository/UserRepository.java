package com.learn.session.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.session.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
