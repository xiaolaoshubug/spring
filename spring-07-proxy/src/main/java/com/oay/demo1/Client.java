package com.oay.demo1;

/*********************************************************
 * @Package: com.oay.demo1
 * @ClassName: Client.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Client {

    public static void main(String[] args) {
        //  ����
        Host host = new Host();
        //  �н�
        Proxy proxy = new Proxy(host);
        //  �����н��ⷿ
        proxy.rent();
    }
}
