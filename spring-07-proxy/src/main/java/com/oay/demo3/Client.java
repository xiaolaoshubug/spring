package com.oay.demo3;

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
        //  ��ʵ��ɫ
        Host host = new Host();
        //  ����ʵ���ĵ��ô������
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //  ����ʵ��ɫ���ý�ȥ��
        pih.setRent(host);
        //  ��̬���ɶ�Ӧ�Ĵ����࣡ȥʵ�ֹ���
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
