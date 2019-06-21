package com.demo;

import com.demo.mapper.UserMapper2;
import com.demo.model.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用SqlSessionTemplate
 * SqlSessionTemplate是SqlSession的实现类
 *
 */
public class Main02 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocations(new String[]{"spring-mybatis-2.xml"});
        context.refresh();
        SqlSessionTemplate sqlSessionTemplate = context.getBean(SqlSessionTemplate.class);
        UserMapper2 userMapper2 = sqlSessionTemplate.getMapper(UserMapper2.class);
        User user = userMapper2.getOne("U00000001");
        System.out.println(user);
    }
}
