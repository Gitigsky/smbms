package cn.service;

import cn.dao.UserMapper;
import cn.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

//声明式注解
@Transactional
//使用注解和扫描仪器使用
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getUser() {
        return userMapper.getUser();

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addUser(User user) {
        int count =userMapper.addUser(user);
        int num=5/0;
        return count;
    }
}
