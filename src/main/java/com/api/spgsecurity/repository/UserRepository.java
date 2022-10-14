package com.api.spgsecurity.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.spgsecurity.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {
    Optional<Users> findUserByUsername(String username);
}