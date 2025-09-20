package com.Bank.Transaction.controller;

import com.Bank.Transaction.model.User;
import com.Bank.Transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //1 Create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    //2 Get user by id
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
    //3 by email
    @GetMapping("/{email}")
    public Optional<User> getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }
    //4 gey all user
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    //5 Update user
    @PutMapping("/{id}")
    public User udateUser(@PathVariable Integer id, @RequestBody User user) {
        user.setId(id); //ensure correct id
        return userService.updateUser(user);
    }
    //6 delete user
    @DeleteMapping("/{id}")
    public String deletUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "User deleted with id: " + id;
    }
}
