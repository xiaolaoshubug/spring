package com.oay.demo1;

/*********************************************************
 * @Package: com.oay.demo1
 * @ClassName: Client.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Client {

    public static void main(String[] args) {
        //  房东
        Host host = new Host();
        //  中介
        Proxy proxy = new Proxy(host);
        //  你找中介租房
        proxy.rent();
    }
}
