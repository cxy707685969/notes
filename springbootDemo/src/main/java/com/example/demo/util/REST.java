package com.example.demo.util;

import com.example.demo.resultEnum.RestEnum;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class REST {
    private String code;
    private String msg;
    private Object data;

   public static REST success(Object data){
        REST rest = new REST();
        rest.setCode(RestEnum.SUCCESS.getCode());
        rest.setMsg(RestEnum.SUCCESS.getMsg());
        rest.setData(data);
        return rest;
    }

}
