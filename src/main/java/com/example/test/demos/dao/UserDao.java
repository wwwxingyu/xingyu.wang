package com.example.test.demos.dao;

import com.example.test.demos.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    void deleteUser(String account);

    User getUserByAccount(@Param("account") String account);

    void updateUser(User user);
}
