package com.oay.pojo;

/*********************************************************
 * @Package: com.oay.pojo
 * @ClassName: User.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-27
 *********************************************************/
public class User {

    private String name;

    public User() {
        System.out.println("user的无参构造。。。");
    }

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
