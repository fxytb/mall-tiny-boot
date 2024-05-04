package com.fxytb.malltinyboot.lombok.example;

import lombok.NonNull;

public class NonNullExample {
    public static void main(String[] args) {
        example("Hello World");
        example(null);
    }

    private static void example(@NonNull String name) {
        System.out.println(name);
    }

}
