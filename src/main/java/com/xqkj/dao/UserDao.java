package com.xqkj.dao;

import com.xqkj.bean.User;

public interface UserDao {
    public User login(String username, String password);

    public int updateUser(User user);

    public User getUserById(int id);

    public int updatePassword(String userId, String newPwd);
}
