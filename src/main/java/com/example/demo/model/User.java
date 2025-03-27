package com.example.demo.model;

import jakarta.persistence.*;

// Marks this class as a JPA entity (i.e., a table in the database).
//Spring Boot (via Hibernate) will create a table called user
@Entity
@Table(name="users")
public class User {

    @Id // Declares the Primary key
    //Auto-generates the id using database auto-increment.
    //Strategy: IDENTITY means the database itself generates the ID (e.g., MySQL’s AUTO_INCREMENT).
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // JPA requires a no-args constructor so that Hibernate can instantiate objects.
    public User(){}

    public User(String name, String email) {
        this.name=name;
        this.email=email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
