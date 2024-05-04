package com.fxytb.malltinyboot.lombok.example;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

public class ValExample {

    public static void main(String[] args) {
        example();
        example2();

    }

    private static void example() {
        val example = new ArrayList<String>();
        example.add("Hello World");
        val foo = example.get(0);
        System.out.println(foo.toLowerCase());
    }


    private static void example2() {
        val example = new HashMap<Integer, String>();
        example.put(0, "Hello World");
        val foo = example.get(0);
        System.out.println(foo.toLowerCase());
    }

}
