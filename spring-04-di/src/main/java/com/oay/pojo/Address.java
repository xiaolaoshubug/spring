package com.oay.pojo;

/*********************************************************
 * @Package: com.oay.pojo
 * @ClassName: Address.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-27
 *********************************************************/
public class Address {
    //  ��ַ
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
