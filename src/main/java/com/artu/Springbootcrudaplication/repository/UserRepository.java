package com.artu.Springbootcrudaplication.repository;

import com.artu.Springbootcrudaplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository  extends JpaRepository<User, Long> {

}
