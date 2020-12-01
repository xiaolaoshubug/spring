package com.oay.demo1;

/*********************************************************
 * @Package: com.oay.demo1
 * @ClassName: Proxy.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }
    public Proxy(Host host) {
        this.host = host;
    }
    //  �н�﷿�����ⷿ��
    public void rent() {
        seeHosts();
        host.rent();
        fare();
    }
    //  �н���Դ��㿴����
    public void seeHosts() {
        System.out.println("�н���Դ��㿴����");
    }
    //  �н���ȡ�н��
    public void fare() {
        System.out.println("�н���ȡ�н��");
    }
}
