package com.fxytb.malltinyboot.lombok.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.val;

@ToString
@Getter
@Setter
public class ToStringExample {

    private String name;

    @ToString.Exclude
    private int age;

    public static void main(String[] args) {
        val toStringExample = new ToStringExample();
        toStringExample.setName("A");
        toStringExample.setAge(20);
        System.out.println(toStringExample);
    }

}
