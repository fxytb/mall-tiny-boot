package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.util.NumberUtil;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.math.RoundingMode;

@Slf4j
public class NumberUtilExample {

    public static void main(String[] args) {

        String str = "100";

        val number = NumberUtil.isNumber(str);
        val anInt = NumberUtil.parseInt(str);

        log.info("number = {}", number);
        log.info("anInt = {}", anInt);

        double n1 = 12.1;
        double n2 = 12.3;

        val add = NumberUtil.add(n1, n2);
        val sub = NumberUtil.sub(n1, n2);
        val mul = NumberUtil.mul(n1, n2);
        val div = NumberUtil.div(n1, n2);
        val round = NumberUtil.round(div, 4);

        val str1 = NumberUtil.toStr(n1);
        val number2 = NumberUtil.isNumber(str1);
        val aDouble = NumberUtil.isDouble(str1);
        val i = NumberUtil.isInteger(str1);

        log.info("add = {}", add);
        log.info("sub = {}", sub);
        log.info("mul = {}", mul);
        log.info("div = {}", div);
        log.info("round = {}", round);
        log.info("number2 = {}", number2);
        log.info("aDouble = {}", aDouble);
        log.info("i = {}", i);

    }

}
