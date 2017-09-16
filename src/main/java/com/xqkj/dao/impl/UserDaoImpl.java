package com.xqkj.dao.impl;

import com.xqkj.bean.User;
import com.xqkj.dao.UserDao;
import com.xqkj.util.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl extends JdbcTemplate implements UserDao {
    public User login(String username, String password) {

        try {
            String sql = "select * from user where name = ? and password = ?";
            Connection conn = this.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet res = pst.executeQuery();
            User user = new User();
            while(res.next()){
                user.setId(res.getInt(1));
                user.setName(res.getString(2));
                user.setPassword(res.getString(3));
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeRes();
        }

        return null;
    }
}
