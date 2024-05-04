package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.crypto.SecureUtil;

public class SecureUtilExample {

    public static void main(String[] args) {

        String str = "12312321";

        String s = SecureUtil.md5(str);

        System.out.println(s);


    }

}
