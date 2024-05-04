package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.lang.Validator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidatorUtilExample {

    public static void main(String[] args) {

        boolean isEmail = Validator.isEmail("cfhxinya@gmail.com");

        boolean mobile = Validator.isMobile("17852645216");

        boolean ipv4 = Validator.isIpv4("192.168.0.101");

        boolean ss = Validator.isChinese("我爱松松");

        boolean citizenId = Validator.isCitizenId("232302199902241714");

        boolean url = Validator.isUrl("http://www.baidu.com");

        boolean birthday = Validator.isBirthday("1999-02-24");

        log.info("是否正确:{}",isEmail);
        log.info("是否正确:{}",mobile);
        log.info("是否正确:{}",ipv4);
        log.info("是否正确:{}",ss);
        log.info("是否正确:{}",citizenId);
        log.info("是否正确:{}",url);
        log.info("是否正确:{}",birthday);

    }

}
