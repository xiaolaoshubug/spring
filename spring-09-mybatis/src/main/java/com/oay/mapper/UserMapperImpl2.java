package com.oay.mapper;

import com.oay.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserMapperImpl2.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> queryUserAll() {
        return getSqlSession().getMapper(UserMapper.class).queryUserAll();
    }
}
