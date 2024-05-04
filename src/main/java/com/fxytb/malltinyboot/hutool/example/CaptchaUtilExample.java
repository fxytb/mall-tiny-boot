package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;

public class CaptchaUtilExample {

    public static void main(String[] args) {

        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 200);

    }

}
