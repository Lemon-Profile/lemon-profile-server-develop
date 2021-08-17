package com.lemon.lemonprofile.service;

import com.lemon.lemonprofile.mapper.UserConditionMapper;
import com.lemon.lemonprofile.model.TbUserConditionVo;
import com.lemon.lemonprofile.model.TbUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserConditionService {
    @Autowired
    UserConditionMapper userConditionMapper;

    public static List<TbUserConditionVo> getUserConditions() {
        return userConditionMapper.getUserConditions();
    }
    public static void createUserCondition(String USER_ID, int SMOKE, int LIVER_DISEASE, int VASCULAR_DISEASE, int BONE_JOINT_DISEASE){
        userConditionMapper.createUserCondition(USER_ID, SMOKE, LIVER_DISEASE, VASCULAR_DISEASE, BONE_JOINT_DISEASE);
    }
    public static void updateUserCondition(String USER_ID, int SMOKE, int LIVER_DISEASE, int VASCULAR_DISEASE, int BONE_JOINT_DISEASE){
        userConditionMapper.updateUserCondition(USER_ID, SMOKE, LIVER_DISEASE, VASCULAR_DISEASE, BONE_JOINT_DISEASE);
    }
    public static void deleteUserCondition(
            String USER_ID){
        userConditionMapper.deleteUserCondition(USER_ID);
    }
    public static TbUserConditionVo getUserCondition(String USER_ID) {
        return userConditionMapper.getUserCondition(USER_ID);
    }

}
