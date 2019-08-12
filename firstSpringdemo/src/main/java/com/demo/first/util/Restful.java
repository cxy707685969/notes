package com.demo.first.util;

import com.demo.first.studentenum.RestEnum;
import lombok.Data;

@Data
public class Restful {
    private String code;
    private String msg;
    private Object data;

    public static Restful success(Object data){
        Restful restful=new Restful();
        restful.setCode(RestEnum.SUCCESS.getCode());
        restful.setMsg(RestEnum.SUCCESS.getMsg());
        restful.setData(data);
        return restful;
    }

    public static Restful fail(Object data){
        Restful restful=new Restful();
        restful.setCode(RestEnum.FAIL.getCode());
        restful.setMsg(RestEnum.FAIL.getMsg());
        restful.setData(data);
        return restful;
    }
}
