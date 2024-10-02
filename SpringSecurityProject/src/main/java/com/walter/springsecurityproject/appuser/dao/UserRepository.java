package com.walter.springsecurityproject.appuser.dao;

import com.walter.springsecurityproject.appuser.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {
    AppUser findByUsername(String username);
}
