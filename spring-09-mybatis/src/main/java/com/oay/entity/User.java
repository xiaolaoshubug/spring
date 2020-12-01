package com.oay.entity;

import lombok.Data;

import java.io.Serializable;

/*********************************************************
 * @Package: com.oay.entity
 * @ClassName: User.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-28
 *********************************************************/
@Data
public class User implements Serializable {

    private int id;
    private String name;
    private String pwd;
}
