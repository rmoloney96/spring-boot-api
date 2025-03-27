package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
// Provides annotations like @RestController, @RequestMapping, @GetMapping, etc.
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Marks this class as a RESTful web service.
// Combines @Controller and @ResponseBody, so all methods return JSON data instead of a view (like in traditional MVC).
@RestController
@RequestMapping("/users") // All endpoints in this controller start with /users.
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Handles HTTP GET /users requests.
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    // Handles HTTP POST /users requests.
    @PostMapping
    // @RequestBody User user → Extracts JSON from the request body and converts it into a User object.
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
