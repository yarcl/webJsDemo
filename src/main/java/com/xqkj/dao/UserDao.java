package com.xqkj.dao;

import com.xqkj.bean.User;

public interface UserDao {
    public User login(String username, String password);
}
