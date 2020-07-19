package com.primestap.primefaces.controller;


import com.primestap.primefaces.exception.ResourceNotFoundException;
import com.primestap.primefaces.model.User;
import com.primestap.primefaces.service.ConfirmationTokenService;
import com.primestap.primefaces.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserControllerx {
/*
    private User user;

    private UserService userService;

    private ConfirmationTokenService confirmationTokenService;

    private List<User> users;

    // Get All Users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return UserService.Alluser();
    }
    // Create a new User
    @PostMapping("/user")
    public User createUser(@Valid @RequestBody User user) {
        UserService.signUpUser(user);
        return user;

    }
    // Create a new User
    @PostMapping("/login")
    public User logUser(@Valid @RequestBody User user) {
        UserService.signinUser(user);
        return user;

    }

    // Get a Single User
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) {
        return UserService.findUser(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
    }


    // Update a User
    @PostMapping("/user/{id}")
    public User updateUser(@PathVariable(value = "id") Long userId,
                           @Valid @RequestBody User userDetails) {

        User user = UserService.findUser(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

        user.setRole(userDetails.getRole());
        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());
        user.setFullname(userDetails.getFullname());

        return UserService.saveUser(user);
    }


    // Delete a User
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
        User user = UserService.findUser(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

        UserService.deleteuser(user);

        return ResponseEntity.ok().build();
    }
*/

}
