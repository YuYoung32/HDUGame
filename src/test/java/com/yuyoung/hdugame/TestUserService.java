package com.yuyoung.hdugame;

import com.yuyoung.hdugame.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Title: TestUserService
 * @Description:
 * @Author: YuYoung
 * @Date: 2021/10/9 14:25
 */
@SpringBootTest
public class TestUserService {
    @Autowired
    UserService userService;
    @Test
    public void testGetGameData(){

        System.out.println(userService.getGameData());
    }
}
