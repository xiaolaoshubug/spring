package com.oay.service;

import com.oay.dao.UserDao;

/*********************************************************
 * @Package: com.oay.service
 * @ClassName: UserServiceImpl.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-27
 *********************************************************/
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //  使用set动态实现注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
