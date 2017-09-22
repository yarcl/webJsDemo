package com.xqkj.service.impl;

import com.xqkj.bean.RazorMenu;
import com.xqkj.dao.MenuDao;
import com.xqkj.service.MenuService;

import java.util.List;

public class MenuServiceImpl implements MenuService {

    private MenuDao menuDao;

    public MenuDao getMenuDao() {
        return menuDao;
    }

    public void setMenuDao(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    public List<RazorMenu> allMenuInfo() {
        return menuDao.allMenuInfo();
    }
}
