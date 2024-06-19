package com.example.test.demos.controller;

import com.example.test.demos.pojo.Result;
import com.example.test.demos.pojo.User;
import com.example.test.demos.service.UserService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User loginMsg) {
        System.out.println(loginMsg);
        User user = userService.getUserByAccount(loginMsg);
        if(Objects.isNull(user)){
            return Result.failure("账号或密码错误");
        }else {
            return Result.success(user);
        }
    }

    @DeleteMapping("/delete/{account}")
    public Result deleteUser(@PathVariable String account) {
        userService.deleteUser(account);
        return Result.success("删除成功");
    }

    @PutMapping("/update")
    public Result updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return Result.success("更新成功");
    }
}
