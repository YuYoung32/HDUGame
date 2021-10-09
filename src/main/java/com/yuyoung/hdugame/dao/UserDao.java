package com.yuyoung.hdugame.dao;

import com.yuyoung.hdugame.entity.UserInfo;

/**
 * @author 29011
 */
public interface UserDao {
    /**
     * 查询当前数据数目，以便随机选择
     * @return 数目
     */
    public Integer selectCount();

    /**
     * 以id为标识，查询一条数据
     * @param id String id
     * @return 一个用户信息对象
     */
    public UserInfo selectOne(String id);
}
