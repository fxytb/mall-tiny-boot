package com.fxytb.malltinyboot.lombok.example;

import lombok.Builder;
import lombok.ToString;
import lombok.val;

@Builder
@ToString
public class BuilderExample {

    private Long id;

    private String name;

    public static void main(String[] args) {

        val build = BuilderExample.builder().id(1L).name("21").build();
        System.out.println(build);

    }

}
