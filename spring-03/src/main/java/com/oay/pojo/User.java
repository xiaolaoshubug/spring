package com.oay.pojo;

/*********************************************************
 * @Package: com.oay.pojo
 * @ClassName: User.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-27
 *********************************************************/
public class User {

    private String name;

    public User() {
        System.out.println("user���޲ι��졣����");
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
