package com.example.demoStringBootAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoStringBootAPI.models.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

}
// taokho 3