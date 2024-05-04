package com.fxytb.malltinyboot.lombok.example;

import lombok.ToString;
import lombok.Value;
import lombok.val;

@Value
@ToString
public class ValueExample {

    Long id;

    String name;

    public static void main(String[] args) {

        val valueExample = new ValueExample(1l,"12231");
        System.out.println(valueExample);

    }

}
