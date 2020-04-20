package com.example.shopdemo.controller;

import com.example.shopdemo.result.Result;
import com.example.shopdemo.service.UserService;
import com.example.shopdemo.utils.ResponseResult;
import com.example.shopdemo.model.SubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/edit")
    public Result editUser(@RequestBody SubUser user) {
        System.out.println(user);
        int edit = userService.edit(user);
        if(edit>0){
            return ResponseResult.success();
        }
        return ResponseResult.error(-1, "保存失败");
    }

    @RequestMapping("/getUser/{id}")
    public Result getUser(@PathVariable("id") int id) {
        SubUser user = userService.getUser(id);
        return ResponseResult.success(user);
    }

    @RequestMapping("/deleteUser/{id}")
    public Result deleteUser(@PathVariable("id") int id) {
        SubUser user = userService.getUser(id);
        return ResponseResult.success(user);
    }


}
