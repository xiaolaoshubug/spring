package com.oay.mapper;

import com.oay.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserServiceImpl.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class UserServiceImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> queryUserAll() {

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        User userAdd = new User(4, "–°ÃÏtx", "123456");
        mapper.addUser(userAdd);
        mapper.deleteUser(6);
        return mapper.queryUserAll();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
