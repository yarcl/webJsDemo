package com.xqkj.action;

import com.xqkj.bean.RazorRole;
import com.xqkj.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleAction {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/allRoleInfo.do")
    public ModelAndView allRoleInfo(ModelAndView mav){
        List<RazorRole> roleList = roleService.allRoleInfo();
        mav.addObject("roleList", roleList);
        mav.setViewName("/page/role/allRoleInfo.jsp");
        return mav;
    }
}
