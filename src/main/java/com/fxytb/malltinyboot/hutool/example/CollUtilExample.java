package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.collection.CollUtil;
import com.fxytb.malltinyboot.model.po.mbg.PmsBrand;
import lombok.val;

import java.util.HashSet;
import java.util.List;

public class CollUtilExample {

    public static void main(String[] args) {

        List<PmsBrand> pmsBrands = CollUtil.newArrayList();
        val e = new PmsBrand();
        e.setId(1L);
        e.setName("123123");
        pmsBrands.add(e);

        String[] arr = {"1","2","3","4","5","6","7","8","9"};

        val list = CollUtil.toList(arr);

        System.out.println(list);


        val empty = CollUtil.isEmpty(list);

        System.out.println(empty);


    }

}
