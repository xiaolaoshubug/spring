package com.oay.service;

import com.oay.dao.UserDao;

/*********************************************************
 * @Package: com.oay.service
 * @ClassName: UserServiceImpl.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-27
 *********************************************************/
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //  ʹ��set��̬ʵ��ע��
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
