package com.xqkj.service;

import com.xqkj.bean.User;

public interface UserService {
    public User login(String username, String password);

    public int updateUser(User user);

    public User getUserById(int id);

    public int updatePassword(String userId, String newPwd);
}
