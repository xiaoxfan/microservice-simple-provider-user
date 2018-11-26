package com.github.xiaoxfan.microservicesimpleprovideruser.controller;

import com.github.xiaoxfan.microservicesimpleprovideruser.entity.User;
import com.github.xiaoxfan.microservicesimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaofan
 * @date 2018/11/26 13:25
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.getOne(id);
    }
}
