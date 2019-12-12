package com.aile.springbootpractice.controller;

/**
 * @Author aile
 * @Date 2019/12/11 17:51
 */

import com.aile.springbootpractice.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }

//    @RequestMapping("/login")
//    public String login(Model model){
//        System.out.println("++++++++++++++++++");
//        return "test";
//    }
}
