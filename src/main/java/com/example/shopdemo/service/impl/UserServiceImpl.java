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

    @Override
    public SubUser getUser(int id){
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int edit(SubUser user){

        return 1;
    }

    @Override
    public int delete(int id){

        return 1;
    }
}
