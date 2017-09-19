package com.xqkj.action;

import com.xqkj.bean.RazorProduct;
import com.xqkj.bean.User;
import com.xqkj.service.RazorProductService;
import com.xqkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
@SessionAttributes("user")
public class LoginAction{

    @Autowired
    private UserService userService;



    @RequestMapping("/login.do")
    public ModelAndView login(String username, String password, ModelAndView mav){

        //System.out.println(username+":"+password);

        User user = userService.login(username,password);
        //System.out.println(user.getName());
        if(user!=null){
            user.setLoginPwd("");
            mav.addObject("user", user);
            //mav.setViewName("myProductInfo.do?userId="+user.getId());
            mav.setViewName("index.jsp");
        }
        return mav;
    }

}
