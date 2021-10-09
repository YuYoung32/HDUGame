package com.yuyoung.hdugame.dao;

import com.yuyoung.hdugame.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: UserDaoImpl
 * @Description:
 * @Author: YuYoung
 * @Date: 2021/10/9 13:37
 */
@Repository
@Transactional(rollbackFor = Exception.class)
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer selectCount() {
        String sql = "select count(*) from userData";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public UserInfo selectOneById(String id) {
        String sql = "SELECT * FROM userData  WHERE userId=?";
        UserInfo userInfo = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class), id);
        return userInfo;
    }
}
