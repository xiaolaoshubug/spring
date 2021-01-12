package com.oay.mapper;

import com.oay.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserServiceImpl.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class UserServiceImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> queryUserAll() {
        //  模拟一个事务失败的场景
        //  删除id为6的数据
        //  数据库里面需要有一条id为4的数据，这里在插入一条id为4的数据时会出现异常
        //  出现事务回滚，删除id为6的数据会回滚
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.deleteUser(6);
        User userAdd = new User(4, "小天tx", "123456");
        mapper.addUser(userAdd);
        return mapper.queryUserAll();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
