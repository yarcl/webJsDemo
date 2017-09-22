package com.xqkj.action;

import com.xqkj.bean.RazorProduct;
import com.xqkj.bean.RazorUser;
import com.xqkj.service.RazorProductService;
import com.xqkj.service.UserService;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
@SessionAttributes("user")
public class LoginAction{

    @Autowired
    private UserService userService;



    @RequestMapping("login.do")
    public ModelAndView login(String username, String password, ModelAndView mav){

        //System.out.println(username+":"+password);

        RazorUser user = userService.login(username,password);
        //System.out.println(user.getName());
        if(user!=null){
            user.setLoginPwd("");
            mav.addObject("user", user);
            //mav.setViewName("myProductInfo.do?userId="+user.getId());
            mav.setViewName("index.jsp");
        } else {
            mav.setViewName("login.jsp");
        }
        return mav;
    }

    @RequestMapping("/loginOut.do")
    public ModelAndView loginOut(ModelAndView mav, HttpServletRequest request){
        HttpSession session = request.getSession();
        if(session!=null){
            //System.out.print(((User)session.getAttribute("user")).getName());
            session.removeAttribute("user");
        }
        mav.setViewName("/login.jsp");
        return mav;
    }
}
