package com.fxytb.malltinyboot.lombok.example;

import lombok.extern.java.Log;

@Log
public class LogExample {

    public static void main(String[] args) {
        log.warning("Hello World");
        log.severe("Hello World");
        log.info("Hello World");
    }

}
