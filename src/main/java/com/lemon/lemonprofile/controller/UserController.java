package com.lemon.lemonprofile.controller;

import com.lemon.lemonprofile.model.TbUserVo;
import com.lemon.lemonprofile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<TbUserVo> getUsers() {
        return userService.getUsers();
    }
    @GetMapping("/user/create")
    public void createUser(String USER_ID, String USER_PASSWORD, String EMAIL, int AGE, int WEIGHT, int HEIGHT, boolean SEX) {
        userService.createUser(USER_ID, USER_PASSWORD, EMAIL, AGE, WEIGHT, HEIGHT, SEX);
    }
    @GetMapping("/user/update")
    public void updateUser(String USER_ID, String USER_PASSWORD, String EMAIL, int AGE, int WEIGHT, int HEIGHT, boolean SEX) {
        userService.updateUser(USER_ID, USER_PASSWORD, EMAIL, AGE, WEIGHT, HEIGHT, SEX);
    }
    @GetMapping("/user/delete")
    public void deleteUser(String USER_ID) {
        userService.deleteUser(USER_ID);
    }
    @GetMapping("/user")
    public TbUserVo getUser(String USER_ID) {
        return userService.getUser(USER_ID);
    }

}
