package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.map.MapUtil;

import java.util.HashMap;

public class MapUtilExample {

    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"1", "1"},
                {"2", "1"}
        };

        HashMap<Object, Object> objectObjectHashMap = MapUtil.of(array);

        System.out.println(objectObjectHashMap);
    }

}
