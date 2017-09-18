package com.xqkj.action;

import com.xqkj.bean.RazorProduct;
import com.xqkj.bean.User;
import com.xqkj.service.RazorProductService;
import com.xqkj.service.UserService;
import com.xqkj.service.impl.RazorProductServiceImpl;
import com.xqkj.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LoginServlet extends HttpServlet{

    private UserService userService = new UserServiceImpl();

    private RazorProductService razorProductService = new RazorProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //System.out.println(username+":"+password);

        User user = userService.login(username,password);
        if(user!=null){
            req.getSession().setAttribute("user", user);
            List<RazorProduct> razorProductList = razorProductService.getRazorProductByUserId(user.getId()+"");
            req.setAttribute("razorProductList", razorProductList);
        }
        //System.out.println(user.getName());
        req.getRequestDispatcher("main.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
