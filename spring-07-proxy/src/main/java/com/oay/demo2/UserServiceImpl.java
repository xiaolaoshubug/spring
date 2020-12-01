package com.oay.demo2;

import com.oay.demo4.AddProxy;

/*********************************************************
 * @Package: com.oay.demo2
 * @ClassName: UserServiceImpl.java
 * @Description： 具体业务实现
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class UserServiceImpl implements UserService, AddProxy {
    public void add() {
        System.out.println("新增了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }

    public void addUser() {
        add();
        System.out.println("再次新增了一个用户");
    }
}
