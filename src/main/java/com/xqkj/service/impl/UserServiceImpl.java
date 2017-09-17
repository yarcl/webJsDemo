package com.xqkj.service.impl;

import com.xqkj.bean.User;
import com.xqkj.dao.UserDao;
import com.xqkj.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User login(String username, String password) {
        return userDao.login(username, password);
    }
}
