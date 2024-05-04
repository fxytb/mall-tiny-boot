package com.fxytb.malltinyboot.lombok.example;

import lombok.Data;

@Data
public class DataExample {

    private Long id;

    private String name;

    public static void main(String[] args) {
        DataExample example = new DataExample();
        example.setId(1l);
        example.setName("212412");
        System.out.println(example);

    }
}
