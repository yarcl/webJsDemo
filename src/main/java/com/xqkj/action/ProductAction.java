package com.xqkj.action;

import com.xqkj.bean.RazorProduct;
import com.xqkj.service.RazorProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2017/9/19.
 */
@Controller
@RequestMapping("/")
public class ProductAction {
    @Autowired
    private RazorProductService razorProductService;

    @RequestMapping("/myProductInfo.do")
    public ModelAndView allProductInfo(ModelAndView mav, String userId){
        List<RazorProduct> razorProductList = razorProductService.getRazorProductByUserId(userId);
        mav.addObject("razorProductList", razorProductList);
        mav.setViewName("page/product/productList.jsp");
        return mav;
    }
}
