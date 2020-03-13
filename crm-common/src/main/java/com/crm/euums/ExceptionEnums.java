package com.crm.euums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnums {
    UNLOGIN(401,"没有登录"),
    SUCCESS(200,"请求成功"),
    PARAM_IS_NULL(400,"参数为空");
    private  int code;


    private  String msg;
}
