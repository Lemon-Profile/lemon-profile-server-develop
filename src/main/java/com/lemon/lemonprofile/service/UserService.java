package com.lemon.lemonprofile.service;

import com.lemon.lemonprofile.mapper.UserMapper;
import com.lemon.lemonprofile.model.TbUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<TbUserVo> getUsers() {
        return userMapper.getUsers();
    }
    public void createUser(String USER_ID, String USER_PASSWORD, String EMAIL, int AGE, int WEIGHT, int HEIGHT, boolean SEX){
        userMapper.createUser(USER_ID, USER_PASSWORD, EMAIL, AGE, WEIGHT, HEIGHT, SEX);
    }
    public void updateUser(
            String USER_ID, String USER_PASSWORD,
            String EMAIL, int AGE,
            int WEIGHT, int HEIGHT, boolean SEX){
        userMapper.updateUser(USER_ID, USER_PASSWORD, EMAIL, AGE, WEIGHT, HEIGHT, SEX);
    }
    public void deleteUser(
            String USER_ID){
        userMapper.deleteUser(USER_ID);
    }

    public TbUserVo getUser(String USER_ID) {
        return userMapper.getUser(USER_ID);
    }

}
