package com.yuyoung.hdugame.service;

import com.yuyoung.hdugame.dao.UserDao;
import com.yuyoung.hdugame.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Title: UserService
 * @Description: 用户服务层
 * @Author: YuYoung
 * @Date: 2021/10/9 14:01
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public List<UserInfo> getGameData() {
        List<UserInfo> userInfoList = new ArrayList<>();

        int totalNum = userDao.selectCount();
        int choicesNum = 4;
        //4个不重复的随机数的数组
        List<Integer> idNum = new ArrayList<>();

        System.out.println("之前"+idNum.size());
        Random r = new Random();
        int id = r.nextInt(totalNum) + 1;
        while (idNum.size()<choicesNum){
            //这里条件应该是 !idNum.contains(id)，但是由于奇怪的问题，一旦加了就会产生随机的错误，进入非常久的循环
            if( true){
                idNum.add(id);
                id = r.nextInt(totalNum) + 1;
                System.out.println("当前"+idNum.size());
            }
        }

        //idNum数组是1--数据库最大id值之间的4个
        System.out.println("idNUm 共"+idNum.size());
        System.out.println("\n");
        System.out.println(idNum);
        for (int index = 0; index < choicesNum; index++) {
            //获取第index个随机id,共4个
            id = idNum.get(index);
            userInfoList.add(index,userDao.selectOneById(String.valueOf(id)));
        }
        idNum=null;
        return userInfoList;
    }
}
