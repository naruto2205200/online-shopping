package com.example.shopdemo.service;

import com.example.shopdemo.model.SubMenu;
import com.example.shopdemo.model.vo.SubMenuVo;

import java.util.List;

/**
 * @author naruto
 * @data 2020/4/18.
 */
public interface MenuService {
    List<SubMenuVo> queryMenuList();
}
