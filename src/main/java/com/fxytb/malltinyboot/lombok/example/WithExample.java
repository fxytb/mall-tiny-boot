package com.fxytb.malltinyboot.lombok.example;

import lombok.*;

@Data
@With
@ToString
@AllArgsConstructor
public class WithExample {

    private Long id;

    private String name;

    public static void main(String[] args) {

        val withExample = new WithExample(1L,"2231");
        withExample.setId(1l);
        withExample.setName("214553");
        System.out.println(withExample);
        val withExample1 = withExample.withId(3l);
        System.out.println(withExample1);

    }

}
