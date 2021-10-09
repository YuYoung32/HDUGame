package com.yuyoung.hdugame.controller;

import com.yuyoung.hdugame.entity.UserInfo;
import com.yuyoung.hdugame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Random;

/**
 * @Title: GameController
 * @Description:
 * @Author: YuYoung
 * @Date: 2021/10/9 10:11
 */
@Controller
public class GameController {
    @Autowired
    private UserService userService;

    @GetMapping("/widgets.html")
    public String mainPage(Model model) {
        List<UserInfo> userInfoList = userService.getGameData();
        Random random=new Random();
        int randomId = random.nextInt(3);
        model.addAttribute("picUrl", userInfoList.get(randomId).userPicUrl);
        model.addAttribute("AChoice", userInfoList.get(0).userName);
        model.addAttribute("BChoice", userInfoList.get(1).userName);
        model.addAttribute("CChoice", userInfoList.get(2).userName);
        model.addAttribute("DChoice", userInfoList.get(3).userName);

        return "widgets";
    }


}
