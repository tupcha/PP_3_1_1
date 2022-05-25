package com.artu.Springbootcrudaplication.service;

import com.artu.Springbootcrudaplication.model.User;
import com.artu.Springbootcrudaplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.getOne(id);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deletedById(Long id) {
        userRepository.deleteById(id);
    }
}
