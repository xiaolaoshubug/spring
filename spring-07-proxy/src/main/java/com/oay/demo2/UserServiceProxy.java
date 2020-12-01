package com.oay.demo2;

/*********************************************************
 * @Package: com.oay.demo2
 * @ClassName: UserServiceProxy.java
 * @Description： set代理实现
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String message) {
        System.out.println("[Debug->] 使用" + message + "方法");
    }
}
