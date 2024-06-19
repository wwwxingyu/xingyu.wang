package com.example.test.demos.service;

import com.example.test.demos.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User getUserByAccount(User loginMsg);

    void deleteUser(String account);

    void updateUser(User user);
}
