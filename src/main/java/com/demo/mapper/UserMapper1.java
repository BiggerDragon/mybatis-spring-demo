package com.demo.mapper;

import com.demo.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper1 {

    int insert(User user);

    int update(User user);

    int delete(User user);

    @Select("select * from t_user where u_no = #{userNo}")
    User getOne(@Param("userNo") String userNo);
}
