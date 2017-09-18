package com.xqkj.dao.impl;

import com.xqkj.bean.RazorProduct;
import com.xqkj.bean.User;
import com.xqkj.dao.RazorProductDao;
import com.xqkj.util.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
public class RazorProductDaoImpl extends JdbcTemplate implements RazorProductDao{

    public List<RazorProduct> getRazorProductByUserId(String userId) {
        try {
            String sql = "select * from razor_product where user_id = ?";
            Connection conn = this.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, userId);

            ResultSet res = pst.executeQuery();
            List<RazorProduct> razorProducts = new ArrayList<RazorProduct>();
            while(res.next()){
                RazorProduct razorProduct = new RazorProduct();
                razorProduct.setId(res.getInt("id"));
                razorProduct.setName(res.getString("name"));
                razorProduct.setDescription(res.getString("description"));
                razorProduct.setDate(res.getDate("date"));
                razorProduct.setUserId(res.getString("user_id"));
                razorProduct.setChannelCount(res.getInt("channel_count"));
                razorProduct.setProductKey(res.getString("product_key"));
                razorProduct.setProductPlatform(res.getString("product_platform"));
                razorProduct.setCategory(res.getString("category"));
                razorProduct.setActive(res.getInt("active"));
                razorProduct.setPackageName(res.getString("package_name"));
                razorProducts.add(razorProduct);
            }
            return razorProducts;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeRes();
        }
        return null;
    }
}
