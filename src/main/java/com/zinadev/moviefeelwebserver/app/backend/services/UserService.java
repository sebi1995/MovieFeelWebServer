package com.zinadev.moviefeelwebserver.app.backend.services;

import com.zinadev.moviefeelwebserver.app.backend.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "mr", "sebastian", "zdroana", "", "", ""));
        users.add(new User(2, "mr", "sebastian", "zdroana", "", "", ""));
        users.add(new User(3, "mr", "sebastian", "zdroana", "", "", ""));
        return users;
    }

}
