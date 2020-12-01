package com.oay.mapper;

import com.oay.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserMapper.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-28
 *********************************************************/
public interface UserMapper {

    List<User> queryUserAll();

    int addUser(User user);

    int deleteUser(@Param("id") int id);
}
