package com.patika.kredinbizdeservice.service;

import java.util.List;

import com.patika.kredinbizdeservice.model.User;

public interface IUserService {
    User save(User user);

    List<User> getAll();

    User getByEmail(String email);

    User update(String email, User user);
}