package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.http.HttpUtil;

public class HttpUtilExample {

    public static void main(String[] args) {

        String s = HttpUtil.get("http://localhost:8081/mall/tiny/generatorCaptcha");

        System.out.println(s);


    }

}
