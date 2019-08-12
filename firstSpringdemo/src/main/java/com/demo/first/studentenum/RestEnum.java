package com.demo.first.studentenum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RestEnum {
    SUCCESS("200","SUCCESS"),
    FAIL("400","FAIL");

    private String code;
    private String msg;
}
