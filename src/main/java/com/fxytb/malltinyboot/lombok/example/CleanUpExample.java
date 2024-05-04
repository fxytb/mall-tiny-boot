package com.fxytb.malltinyboot.lombok.example;

import lombok.Cleanup;
import lombok.val;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class CleanUpExample {

    public static void main(String[] args) throws IOException {
        String test = "我爱松松";
        @Cleanup val byteArrayInputStream = new ByteArrayInputStream(test.getBytes("UTF-8"));
        @Cleanup val byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = byteArrayInputStream.read(bytes)) != -1) {
            byteArrayOutputStream.write(bytes, 0, len);
        }
        System.out.println(byteArrayOutputStream.toString("UTF-8"));
    }

}
