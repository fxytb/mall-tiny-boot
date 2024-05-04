package com.fxytb.malltinyboot.lombok.example;

import lombok.Data;
import lombok.Getter;
import lombok.val;

@Data
public class GetterLazyExample {

    private Long id;

    @Getter(lazy = true)
    private final double[] array = new double[100000];

    public static void main(String[] args) {

        val getterLazyExample = new GetterLazyExample();
        val array1 = getterLazyExample.getArray();
        System.out.println(array1);
    }

}
