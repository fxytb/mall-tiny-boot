package com.fxytb.malltinyboot.controller;


import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/mall/tiny")
public class MallTinyController {


    @GetMapping("/generatorCaptcha")
    private void generatorCaptcha(HttpServletRequest request, HttpServletResponse response) {
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(300, 200);
        try {
            request.getSession().setAttribute("CAPTCHA_CODE", lineCaptcha.getCode());
            response.setContentType("image/png");
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            lineCaptcha.write(response.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
