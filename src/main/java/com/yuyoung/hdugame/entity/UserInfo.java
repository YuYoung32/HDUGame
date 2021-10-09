package com.yuyoung.hdugame.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title: UserInfo
 * @Description: 用户实体
 * @Author: YuYoung
 * @Date: 2021/10/9 13:26
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserInfo {
    public String userId;
    public String userName;
    public String userPicUrl;

}
