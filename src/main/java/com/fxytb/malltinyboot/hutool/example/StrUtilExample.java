package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

@Slf4j
public class StrUtilExample {

    public static void main(String[] args) {

        //判断是否为空字符串
        String str = "test";
        val blank = StrUtil.isBlank(str);
        val notBlank = StrUtil.isNotBlank(str);

        //去除字符串后缀
        val removeSuffix = StrUtil.removeSuffix("a.jpg", ".jpg");
        //去除字符串前缀
        val removePrefix = StrUtil.removePrefix("a.jpg", "a.");

        //格式化字符串
        String template = "这只是个占位符:{}";
        val format = StrUtil.format(template, "12321");

        log.info("判断结果:{}",blank);
        log.info("判断结果:{}",notBlank);
        log.info(removeSuffix);
        log.info(removePrefix);
        log.info(format);

    }

}
