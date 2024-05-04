package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import lombok.val;

import java.util.Calendar;

public class DateUtilExample {

    public static void main(String[] args) {

        //获取当前时间
        val date = DateUtil.date();
        //Calender转Date
        val date1 = DateUtil.date(Calendar.getInstance());
        //时间戳转date
        val date2 = DateUtil.date(System.currentTimeMillis());
        //自动识别格式转换
        String dateStr = "2024-05-01";
        val parse = DateUtil.parse(dateStr);
        //格式化输出日期
        val format = DateUtil.format(parse, DatePattern.NORM_DATE_FORMAT);
        //获取年的部分
        val year = DateUtil.year(parse);
        //获取月份
        val month = DateUtil.month(parse)+1;
        //获取某天的开始、结束时间
        val beginOfDay = DateUtil.beginOfDay(parse);
        val endOfDay = DateUtil.endOfDay(parse);
        //计算偏移后的日期
        val offset = DateUtil.offset(parse, DateField.DAY_OF_MONTH, 2);
        //计算日期时间之间的偏移量
        val between = DateUtil.between(parse, offset, DateUnit.DAY);

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(format);
        System.out.println(year);
        System.out.println(month);
        System.out.println(beginOfDay);
        System.out.println(endOfDay);
        System.out.println(offset);
        System.out.println(between);

    }

}
