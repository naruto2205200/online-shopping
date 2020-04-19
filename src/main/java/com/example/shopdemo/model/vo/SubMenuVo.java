package com.example.shopdemo.model.vo;

import com.example.shopdemo.model.SubMenu;
import lombok.Data;

import java.util.List;

/**
 * @author naruto
 * @data 2020/4/19.
 */
@Data
public class SubMenuVo extends SubMenu {
    private List<SubMenuVo> children;
}
