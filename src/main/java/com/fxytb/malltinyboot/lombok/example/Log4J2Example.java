package com.fxytb.malltinyboot.lombok.example;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Log4J2Example {

    public static void main(String[] args) {
        log.info("Hello World");
        log.warn("Hello World");
        log.error("Hello World");
    }

}
