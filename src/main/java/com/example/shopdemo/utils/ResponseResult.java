package com.example.shopdemo.utils;

import com.example.shopdemo.result.Result;
import lombok.Data;
import com.example.shopdemo.enums.ResultEnum;

/**
 * @author naruto
 * @data 2020/4/18.
 */
@Data
public class ResponseResult {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }
    /**成功但不带数据**/
    public static Result success(){
        return success(null);
    }
    /**失败**/
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
