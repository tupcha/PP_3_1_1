package com.artu.Springbootcrudaplication.service;

import com.artu.Springbootcrudaplication.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> getAll();

    User saveUser(User user);


    void deletedById(Long id);


}
