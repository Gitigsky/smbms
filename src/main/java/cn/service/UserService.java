package cn.service;

import cn.pojo.User;

import java.util.List;

public interface UserService {
    //查询所有
    public List<User> getUser();
    //    新增
    public  int addUser(User user);
}
