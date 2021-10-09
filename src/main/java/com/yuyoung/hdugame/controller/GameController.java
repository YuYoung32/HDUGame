package com.yuyoung.hdugame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Title: GameController
 * @Description:
 * @Author: YuYoung
 * @Date: 2021/10/9 10:11
 */
@Controller
public class GameController {
    @GetMapping("/widgets.html")
    public String mainPage(Model model){
        model.addAttribute("picUrl","https://z3.ax1x.com/2021/09/22/4tOtv8.jpg");
        model.addAttribute("AChoice","小孙");
        model.addAttribute("BChoice","小wang");
        model.addAttribute("CChoice","小孙");
        model.addAttribute("DChoice","小孙");

        return "widgets";
    }


}
