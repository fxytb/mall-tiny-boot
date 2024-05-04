package com.fxytb.malltinyboot.lombok.example;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@NoArgsConstructor
@ToString
public class ConstructorExample {

    @NonNull
    private Long id;

    private String name;

    public static void main(String[] args) {
        val constructorExample1 = new ConstructorExample();
        val constructorExample2 = ConstructorExample.of(1L);
        val constructorExample3 = new ConstructorExample(1L,"12121");
        System.out.println(constructorExample1);
        System.out.println(constructorExample2);
        System.out.println(constructorExample3);
    }

}
