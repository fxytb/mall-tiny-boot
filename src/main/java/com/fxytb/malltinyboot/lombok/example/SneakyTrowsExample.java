package com.fxytb.malltinyboot.lombok.example;

import lombok.SneakyThrows;

public class SneakyTrowsExample {

    public static void main(String[] args) {
        example();
    }

    @SneakyThrows(Exception.class)
    private static void example() {
        int i = 1 / 0;
    }

}
