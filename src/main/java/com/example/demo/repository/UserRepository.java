package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;
//used for data persistence
public interface UserRepository extends JpaRepository<User, Integer>{

}
