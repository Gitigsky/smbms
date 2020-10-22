package cn.dao;

import cn.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    @Override
    public List<User> getUser() {

        return sessionTemplate.selectList("cn.dao.UserMapper.getUser");
    }

    @Override
    public int addUser(User user) {
        return 0;
    }
}
