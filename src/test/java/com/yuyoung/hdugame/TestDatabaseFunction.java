package com.yuyoung.hdugame;

import com.yuyoung.hdugame.dao.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Title: TestDatabaseFunction
 * @Description:
 * @Author: YuYoung
 * @Date: 2021/10/9 13:49
 */
@SpringBootTest
public class TestDatabaseFunction {
    @Autowired
    private UserDaoImpl userDaoImpl;

    @Test
    public void testSelectCount(){
        System.out.println(userDaoImpl.selectCount());
    }

    @Test
    public void testSelectOne(){
        String id = "1";
        System.out.println(userDaoImpl.selectOneById(id));
    }

}
