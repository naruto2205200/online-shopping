package com.example.shopdemo.service.impl;

import com.example.shopdemo.mapper.SubUserMapper;
import com.example.shopdemo.service.UserService;
import com.example.shopdemo.model.SubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author naruto
 * @data 2020/4/19.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SubUserMapper userMapper;
    @Override
    public List<SubUser> queryUserList() {
        return userMapper.queryUserList();
    }
}
