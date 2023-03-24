package com.example.Sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String CreateUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
