package com.xqkj.service.impl;

import com.xqkj.bean.RazorProduct;
import com.xqkj.dao.RazorProductDao;
import com.xqkj.dao.impl.RazorProductDaoImpl;
import com.xqkj.service.RazorProductService;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
public class RazorProductServiceImpl implements RazorProductService{

    private RazorProductDao razorProductDao = new RazorProductDaoImpl();

    public List<RazorProduct> getRazorProductByUserId(String userId) {
        return razorProductDao.getRazorProductByUserId(userId);
    }
}
