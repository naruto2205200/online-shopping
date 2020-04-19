package com.example.shopdemo.controller;

import com.example.shopdemo.model.SubMenu;
import com.example.shopdemo.model.vo.SubMenuVo;
import com.example.shopdemo.service.MenuService;
import com.example.shopdemo.utils.ResponseResult;
import com.example.shopdemo.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author naruto
 * @data 2020/4/18.
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;
    @RequestMapping("/menuList")
    public Result queryMenuList(){
        List<SubMenuVo> menuList = menuService.queryMenuList();
        return ResponseResult.success(menuList);
    }

}
