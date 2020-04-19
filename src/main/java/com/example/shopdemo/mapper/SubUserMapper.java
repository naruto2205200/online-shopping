package com.example.shopdemo.mapper;

import com.example.shopdemo.model.SubUser;

import java.util.List;

public interface SubUserMapper {
    SubUser selectByPrimaryKey(Integer id);

    List<SubUser> queryUserList();
}