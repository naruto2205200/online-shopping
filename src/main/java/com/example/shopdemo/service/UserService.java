package com.example.shopdemo.service;

import com.example.shopdemo.model.SubUser;

import java.util.List;

/**
 * @author naruto
 * @data 2020/4/19.
 */
public interface UserService {
    List<SubUser> queryUserList();
}
