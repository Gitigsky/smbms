package Test;

import cn.pojo.User;
import cn.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class UserTest {
    private static Logger logger=Logger.getLogger(UserTest.class);

//    查询
    @Test
    public void getUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=context.getBean("userService",UserService.class);
        List<User> users =userService.getUser();
        for (User user:users) {
            logger.info("用户名：===》"+user.getUserName());
        }
    }
    //新增
    @Test
    public void addUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=context.getBean("userService",UserService.class);
        User user=new User("zhangsan0666","张三03","12345678",1,"13546212543","天津市海定区朝阳区69路3",1,1,1);
        System.out.println("结果===》");
        logger.info(userService.addUser(user));

    }
}
