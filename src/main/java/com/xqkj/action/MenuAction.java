package com.xqkj.action;

import com.xqkj.bean.RazorMenu;
import com.xqkj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuAction {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/allMenuInfo.do")
    public ModelAndView allMenuInfo(ModelAndView mav){

        List<RazorMenu> menuList = menuService.allMenuInfo();

        mav.addObject("menuList", menuList);
        mav.setViewName("/page/menu/allMenuInfo.jsp");

        return mav;
    }
}
