package com.example.test.demos.controller;

import com.example.test.demos.pojo.Result;
import com.example.test.demos.pojo.User;
import com.example.test.demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User loginMsg) {
        User user = userService.getUserByAccount(loginMsg);
        if(Objects.isNull(user)){
            return Result.failure("账号或密码错误");
        }else {
            return Result.success(user);
        }
    }

}
