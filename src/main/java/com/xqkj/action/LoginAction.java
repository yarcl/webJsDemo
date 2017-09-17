package com.xqkj.action;

import com.xqkj.bean.User;
import com.xqkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginAction{

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public String login(String username, String password){

        System.out.println(username+":"+password);

        User user = userService.login(username,password);
        System.out.println(user.getName());
        return null;
    }

}
