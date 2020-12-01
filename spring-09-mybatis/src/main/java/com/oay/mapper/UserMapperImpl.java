package com.oay.mapper;

import com.oay.entity.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserMapperImpl.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> queryUserAll() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.queryUserAll();
    }
}
