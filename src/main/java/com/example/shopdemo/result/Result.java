package com.example.shopdemo.result;

import lombok.Data;

/**
 * @author naruto
 * @data 2020/4/18.
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
    public Result(){
        super();
    }

    public Result(Integer code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
