package com.patika.kredinbizdeservice.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.patika.kredinbizdeservice.model.User;

public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public void save(User user) {
        userList.add(user);
    }

    public List<User> getAll() {
        return userList;
    }

    public Optional<User> findByEmail(String email) {
        return userList.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    public void delete(User user) {
        userList.remove(user);
    }
}