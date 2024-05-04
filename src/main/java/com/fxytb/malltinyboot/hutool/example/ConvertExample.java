package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.convert.Convert;
import lombok.val;

import java.util.Arrays;

public class ConvertExample {

    public static void main(String[] args) {

        covertExample();


    }

    private static void covertExample() {
        //转换为字符串
        int a = 1;
        String aStr = Convert.toStr(a);
        //转换为指定类型的数组
        String[] b = {"1", "2", "3", "4"};
        val intArray = Convert.toIntArray(b);
        //转换为日期对象
        String dateStr = "2017-03-01";
        val date = Convert.toDate(dateStr);
        //转换为集合
        val list = Convert.toList(Integer.class, b);

        System.out.println(aStr);
        System.out.println(Arrays.toString(intArray));
        System.out.println(date);
        System.out.println(list);
    }

}
