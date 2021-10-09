package com.yuyoung.hdugame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Title: IndexController
 * @Description:
 * @Author: YuYoung
 * @Date: 2021/10/9 9:32
 */
@Controller
public class IndexController {
    @GetMapping(value = {"/"})
    public String indexPage(){
        return "login";
    }

    @PostMapping("widgets")
    public String main(){

        return "redirect:/widgets.html";
    }

}
