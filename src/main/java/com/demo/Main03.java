package com.demo;

import com.demo.mapper.UserMapper1;
import com.demo.mapper.UserMapper2;
import com.demo.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用MapperScannerConfigurer来生成Mapper的代理对象，
 * 直接获取Mapper的代理对象就可以操作SqlSession了
 *
 */
public class Main03 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocations(new String[]{"spring-mybatis-3.xml"});
        context.refresh();
        UserMapper2 userMapper2 = context.getBean(UserMapper2.class);
        System.out.println(userMapper2);
        User user = userMapper2.getOne("U00000001");
        System.out.println(user);

        UserMapper1 userMapper1 = context.getBean(UserMapper1.class);
        User user1 = userMapper1.getOne("U00000001");
        System.out.println(user1);
    }
}
