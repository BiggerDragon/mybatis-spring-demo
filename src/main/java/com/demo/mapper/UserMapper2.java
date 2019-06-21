package com.demo.mapper;

import com.demo.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper2 {

    int insert(User user);

    int update(User user);

    int delete(User user);

    User getOne(String userNo);
}
