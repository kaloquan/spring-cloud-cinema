package me.kaloquan.cinemauser.controller;

import me.kaloquan.cinemauser.entity.User;
import me.kaloquan.cinemauser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable(value = "id")Long id){
        User user = userRepository.findOne(id);
        return user;
    }
}
