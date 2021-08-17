package com.lemon.lemonprofile.controller;

import com.lemon.lemonprofile.model.TbUserConditionVo;
import com.lemon.lemonprofile.service.UserConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UserConditionController {
    @Autowired
    UserConditionService userConditionService;

    @GetMapping("/user_conditions")
    public List<TbUserConditionVo> getUserConditions() {
        return UserConditionService.getUserConditions();
    }
    @GetMapping("/user_condition/create")
    public void createUserCondition(String USER_ID, int SMOKE, int LIVER_DISEASE, int VASCULAR_DISEASE, int BONE_JOINT_DISEASE) {
        UserConditionService.createUserCondition(USER_ID, SMOKE, LIVER_DISEASE, VASCULAR_DISEASE, BONE_JOINT_DISEASE);
    }
    @GetMapping("/user_condition/update")
    public void updateUserCondition(String USER_ID, int SMOKE, int LIVER_DISEASE, int VASCULAR_DISEASE, int BONE_JOINT_DISEASE) {
        UserConditionService.updateUserCondition(USER_ID, SMOKE, LIVER_DISEASE, VASCULAR_DISEASE, BONE_JOINT_DISEASE);
    }
    @GetMapping("/user_condition/delete")
    public void deleteUserCondition(String USER_ID) {
        UserConditionService.deleteUserCondition(USER_ID);
    }
    @GetMapping("/user_condition")
    public TbUserConditionVo getUser(String USER_ID) {
        return UserConditionService.getUserCondition(USER_ID);
    }

}
