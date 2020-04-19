package com.example.shopdemo.controller;

import com.example.shopdemo.result.Result;
import com.example.shopdemo.service.UserService;
import com.example.shopdemo.utils.ResponseResult;
import com.example.shopdemo.model.SubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.List;

/**
 * @author naruto
 * @data 2020/4/19.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/userList")
    public Result queryMenuList(){
        List<SubUser> subUsers = userService.queryUserList();
        return ResponseResult.success(subUsers);
    }

    @RequestMapping("/{id}/state/{mgState}")
    public Result editUser(@PathVariable("id") int id, @PathVariable("mgState") boolean mgState) {
        System.out.println(id+":"+mgState);
        return ResponseResult.success();
    }
}
