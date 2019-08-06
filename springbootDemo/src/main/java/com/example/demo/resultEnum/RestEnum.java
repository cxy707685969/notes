package com.example.demo.resultEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum RestEnum {
    SUCCESS("200","success"),
    FAIL("400","fail");
    private String code;
    private String msg;
}
