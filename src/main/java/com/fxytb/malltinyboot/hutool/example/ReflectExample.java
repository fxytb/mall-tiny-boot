package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.util.ReflectUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

@Data
@Slf4j
public class ReflectExample {

    private String name;

    public static void main(String[] args) {
        val methods = ReflectUtil.getMethods(ReflectExample.class);
        val reflectExample = ReflectUtil.newInstance(ReflectExample.class);
        ReflectUtil.invoke(reflectExample, "setName", "2134124100");
        val getName = ReflectUtil.invoke(reflectExample, "getName");
        log.info("内容:{}", getName);
        log.info("内容:{}", reflectExample);
    }

    void a() {

    }


    void b() {

    }
}
