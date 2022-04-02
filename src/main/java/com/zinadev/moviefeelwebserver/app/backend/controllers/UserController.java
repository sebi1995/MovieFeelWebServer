package com.zinadev.moviefeelwebserver.app.backend.controllers;

import com.zinadev.moviefeelwebserver.app.backend.models.User;
import com.zinadev.moviefeelwebserver.app.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/all")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

}
