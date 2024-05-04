package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.crypto.digest.DigestUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DigestUtilExample {

    public static void main(String[] args) {

        String password = "123456";

        String result = DigestUtil.md5Hex(password);
        String result2 = DigestUtil.sha256Hex(password);
        String bcrypt = DigestUtil.bcrypt(password);
        boolean check = DigestUtil.bcryptCheck("123456", bcrypt);


        log.info("加密字符串:{}", result);
        log.info("加密字符串:{}", result2);
        log.info("加密字符串:{}", bcrypt);
        log.info("加密字符串:{}", check);

    }

}
