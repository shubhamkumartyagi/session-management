package com.learn.session.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.session.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
