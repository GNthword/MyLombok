package com.milog.mylombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.var;

/**
 * Created by miloway on 2018/7/5.
 */

public class MyUser {

    @Getter
    @Setter
    private String name;

    var age;

    @Accessors
    private boolean sex;
}
