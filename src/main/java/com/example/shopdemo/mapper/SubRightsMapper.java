package com.example.shopdemo.mapper;

import com.example.shopdemo.model.SubRights;

import java.util.List;

public interface SubRightsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SubRights record);

    int insertSelective(SubRights record);

    SubRights selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SubRights record);

    int updateByPrimaryKey(SubRights record);

    List<SubRights> queryRightsList();
}