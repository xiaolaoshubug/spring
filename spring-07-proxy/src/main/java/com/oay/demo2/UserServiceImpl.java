package com.oay.demo2;

import com.oay.demo4.AddProxy;

/*********************************************************
 * @Package: com.oay.demo2
 * @ClassName: UserServiceImpl.java
 * @Description�� ����ҵ��ʵ��
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class UserServiceImpl implements UserService, AddProxy {
    public void add() {
        System.out.println("������һ���û�");
    }

    public void delete() {
        System.out.println("ɾ����һ���û�");
    }

    public void update() {
        System.out.println("�޸���һ���û�");
    }

    public void query() {
        System.out.println("��ѯ��һ���û�");
    }

    public void addUser() {
        add();
        System.out.println("�ٴ�������һ���û�");
    }
}
