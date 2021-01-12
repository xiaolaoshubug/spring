package com.oay.mapper;

import com.oay.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserServiceImpl.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class UserServiceImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> queryUserAll() {
        //  ģ��һ������ʧ�ܵĳ���
        //  ɾ��idΪ6������
        //  ���ݿ�������Ҫ��һ��idΪ4�����ݣ������ڲ���һ��idΪ4������ʱ������쳣
        //  ��������ع���ɾ��idΪ6�����ݻ�ع�
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.deleteUser(6);
        User userAdd = new User(4, "С��tx", "123456");
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
