package com.example.demo.repository;


import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Spring Data JPA interface that provides CRUD functionality.
//It extends JpaRepository<User, Long>, which gives it built-in database methods.
//The first generic parameter (User) specifies the entity type.
//The second generic parameter (Long) specifies the data type of the primary key (id).
public interface UserRepository extends JpaRepository<User, Long> {
}
