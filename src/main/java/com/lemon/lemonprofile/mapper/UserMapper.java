package com.lemon.lemonprofile.mapper;

import com.lemon.lemonprofile.model.TbUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<TbUserVo> getUsers();
    void createUser(
            String USER_ID, String USER_PASSWORD,
            String EMAIL, int AGE,
            int WEIGHT, int HEIGHT, boolean SEX
    );
    void updateUser(
            //USERID로
            String USER_ID, String USER_PASSWORD,
            String EMAIL, int AGE,
            int WEIGHT, int HEIGHT, boolean SEX
    );
    void deleteUser(
            String USER_ID
    );
    TbUserVo getUser(String USER_ID);


}
