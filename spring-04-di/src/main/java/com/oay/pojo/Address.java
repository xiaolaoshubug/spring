package com.oay.pojo;

/*********************************************************
 * @Package: com.oay.pojo
 * @ClassName: Address.java
 * @Description£ºÃèÊö
 * -----------------------------------
 * @author£ºouay
 * @Version£ºv1.0
 * @Date: 2020-11-27
 *********************************************************/
public class Address {
    //  µØÖ·
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
