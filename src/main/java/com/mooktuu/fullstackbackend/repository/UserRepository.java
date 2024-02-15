package com.mooktuu.fullstackbackend.repository;

import com.mooktuu.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
