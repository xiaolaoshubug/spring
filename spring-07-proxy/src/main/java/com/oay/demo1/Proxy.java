package com.oay.demo1;

/*********************************************************
 * @Package: com.oay.demo1
 * @ClassName: Proxy.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }
    public Proxy(Host host) {
        this.host = host;
    }
    //  中介帮房东出租房子
    public void rent() {
        seeHosts();
        host.rent();
        fare();
    }
    //  中介可以带你看房子
    public void seeHosts() {
        System.out.println("中介可以带你看房子");
    }
    //  中介收取中介费
    public void fare() {
        System.out.println("中介收取中介费");
    }
}
