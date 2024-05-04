package com.fxytb.malltinyboot.lombok.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

@EqualsAndHashCode
@Getter
@Setter
public class EqualAndHashCodeExample {

    private Long id;

    @EqualsAndHashCode.Exclude
    private String name;

    public static void main(String[] args) {

        val equalAndHashCodeExample = new EqualAndHashCodeExample();
        equalAndHashCodeExample.setId(1l);
        equalAndHashCodeExample.setName("111");
        val equalAndHashCodeExample2 = new EqualAndHashCodeExample();
        equalAndHashCodeExample2.setId(1l);
        equalAndHashCodeExample2.setName("1112");
        System.out.println(equalAndHashCodeExample.equals(equalAndHashCodeExample2));

    }
}
