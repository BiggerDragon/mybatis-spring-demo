package com.demo;

import com.demo.mapper.UserMapper2;
import com.demo.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用MapperFactoryBean来
 *
 */
public class Main01 {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocations(new String[]{"spring-mybatis-1.xml"});
        context.refresh();

        UserMapper2 userMapper = context.getBean(UserMapper2.class);

        System.out.println(userMapper);
        User user = userMapper.getOne("U00000001");
        System.out.println(user);

    }
}
