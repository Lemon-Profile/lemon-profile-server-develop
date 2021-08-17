package com.lemon.lemonprofile.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TbUserConditionVo {
    private String USER_ID;
    private int SMOKE;
    private int LIVER_DISEASE;
    private int VASCULAR_DISEASE;
    private int BONE_JOINT_DISEASE;
}