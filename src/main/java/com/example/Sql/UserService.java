package com.example.Sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "user added successfully";
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
