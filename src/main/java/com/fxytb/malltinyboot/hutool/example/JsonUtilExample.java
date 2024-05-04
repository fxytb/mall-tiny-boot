package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.lang.TypeReference;
import cn.hutool.json.JSONConfig;
import cn.hutool.json.JSONUtil;
import com.fxytb.malltinyboot.model.po.mbg.PmsBrand;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class JsonUtilExample {


    public static void main(String[] args) {

        val pmsBrand = new PmsBrand();
        pmsBrand.setId(1l);
        pmsBrand.setName("12312");
        val jsonStr = JSONUtil.toJsonStr(pmsBrand, new JSONConfig().setIgnoreNullValue(false));
        log.info("bean to json , content:{}", jsonStr);
        val bean = JSONUtil.toBean(jsonStr, PmsBrand.class);
        log.info("json to bean , content:{}", bean);
        List<PmsBrand> list = new ArrayList<>();
        list.add(pmsBrand);
        val jsonStr1 = JSONUtil.toJsonStr(list, new JSONConfig().setIgnoreNullValue(false));
        log.info("list to json , content:{}", jsonStr1);
        val list2 = JSONUtil.toBean(jsonStr, new TypeReference<List<PmsBrand>>() {
        }, false);
        log.info("json to list , content:{}", list2);
        val list3 = JSONUtil.toList(jsonStr1, PmsBrand.class);
        log.info("json to list , content:{}", list3);
    }

}
