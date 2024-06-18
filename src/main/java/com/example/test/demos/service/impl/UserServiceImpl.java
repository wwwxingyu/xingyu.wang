package com.example.test.demos.service.impl;

import com.example.test.demos.dao.UserDao;
import com.example.test.demos.pojo.User;
import com.example.test.demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByAccount(User loginMsg) {
        User user = userDao.getUserByAccount(loginMsg.getAccount());
        if((!Objects.isNull(user))&&(!Objects.isNull(loginMsg.getPassword()))&&loginMsg.getPassword().equals(user.getPassword())){
            return user;
        }else {
            return null;
        }
    }
}
