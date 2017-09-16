package com.xqkj.service;

import com.xqkj.bean.User;
import com.xqkj.dao.UserDao;
import com.xqkj.dao.impl.UserDaoImpl;

public interface UserService {



    public User login(String username, String password);


}
