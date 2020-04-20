package com.example.shopdemo.service.impl;

import com.example.shopdemo.mapper.SubRightsMapper;
import com.example.shopdemo.model.SubRights;
import com.example.shopdemo.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangxiaofeng
 * @Describetion
 * @date 2020/4/2015:28
 */
@Service
public class PowerServiceImpl implements PowerService {
    @Autowired
    private SubRightsMapper rightsMapper;
    @Override
    public List<SubRights> queryRightsList() {
        return rightsMapper.queryRightsList();
    }
}
