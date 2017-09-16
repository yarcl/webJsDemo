package com.xqkj.service.impl;

import com.xqkj.bean.User;
import com.xqkj.dao.UserDao;
import com.xqkj.dao.impl.UserDaoImpl;
import com.xqkj.service.UserService;

public class UserServiceImpl implements UserService {
    public UserDao userdao = new UserDaoImpl();
    public User login(String username, String password) {
        return userdao.login(username, password);
    }
}
