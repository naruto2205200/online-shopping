package com.example.shopdemo.mapper;

import com.example.shopdemo.model.SubMenu;
import com.example.shopdemo.model.vo.SubMenuVo;

import java.util.List;

public interface SubMenuMapper {
    List<SubMenuVo> queryMenuList();
}