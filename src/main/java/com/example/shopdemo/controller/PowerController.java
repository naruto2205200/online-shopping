package com.example.shopdemo.controller;

import com.example.shopdemo.model.SubRights;
import com.example.shopdemo.result.Result;
import com.example.shopdemo.service.PowerService;
import com.example.shopdemo.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangxiaofeng
 * @Describetion
 * @date 2020/4/2015:23
 */
@RestController
@RequestMapping("/power")
public class PowerController {
    @Autowired
    private PowerService powerService;
    @RequestMapping("/rightsList")
    public Result queryRightsList(){
        List<SubRights> subRights = powerService.queryRightsList();
        return ResponseResult.success(subRights);
    }

    @RequestMapping("/rolesList")
    public Result queryRolesList(){
        List<SubRights> subRights = powerService.queryRightsList();
        return ResponseResult.success(subRights);
    }

}
