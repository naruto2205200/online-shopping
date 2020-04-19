package com.example.shopdemo.service.impl;

import com.example.shopdemo.mapper.SubMenuMapper;
import com.example.shopdemo.model.SubMenu;
import com.example.shopdemo.model.vo.SubMenuVo;
import com.example.shopdemo.service.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author naruto
 * @data 2020/4/18.
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private SubMenuMapper subMenuMapper;
    //====================自定义===========================
    @Override
    public List<SubMenuVo> queryMenuList() {
        List<SubMenuVo> subMenus = subMenuMapper.queryMenuList();
        List<SubMenuVo> result = new ArrayList<>();
        if (subMenus != null && subMenus.size() > 0) {
            for (SubMenuVo sub:subMenus) {
                if(sub.getParent()==null) {
                    List<SubMenuVo> collect = subMenus.stream().filter(item -> item.getParent() == sub.getId()).collect(Collectors.toList());
                    sub.setChildren(collect);
                    result.add(sub);
                }
            }
        }
        return result;
    }
}
