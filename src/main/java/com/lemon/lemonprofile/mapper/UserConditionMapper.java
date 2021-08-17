package com.lemon.lemonprofile.mapper;

import com.lemon.lemonprofile.model.TbUserConditionVo;
import com.lemon.lemonprofile.model.TbUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserConditionMapper {


    List<TbUserConditionVo> getUserConditions();

    void createUserCondition(String user_id, int smoke, int liver_disease, int vascular_disease, int bone_joint_disease);

    void updateUserCondition(String user_id, int smoke, int liver_disease, int vascular_disease, int bone_joint_disease);

    void deleteUserCondition(String user_id);

    TbUserConditionVo getUserCondition(String user_id);
}
