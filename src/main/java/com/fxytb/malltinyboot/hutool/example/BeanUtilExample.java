package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.bean.BeanUtil;
import com.fxytb.malltinyboot.model.po.mbg.PmsBrand;
import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

public class BeanUtilExample {
    public static void main(String[] args) {

        val pmsBrand = new PmsBrand();
        pmsBrand.setName("123213");
        pmsBrand.setId(1l);

        val pmsBrand1 = BeanUtil.copyProperties(pmsBrand, PmsBrand.class);
        System.out.println(pmsBrand1);

        val stringObjectMap = BeanUtil.beanToMap(pmsBrand);
        System.out.println(stringObjectMap);

        val collection = new ArrayList<PmsBrand>();
        collection.add(pmsBrand);
        val o = collection.get(0);
        o.setId(3l);
        val list = BeanUtil.copyToList(collection, PmsBrand.class);
        System.out.println(list);

        val objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("id", "11l");
        objectObjectHashMap.put("name", "1l");

        val bean = BeanUtil.toBean(objectObjectHashMap, PmsBrand.class);

        System.out.println(bean);

    }
}
