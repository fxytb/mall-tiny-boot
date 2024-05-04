package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.crypto.digest.BCrypt;

public class BCryptExample {

    public static void main(String[] args) {

        String hashpw = BCrypt.hashpw("1231213");
        System.out.println(hashpw);

        boolean checkpw = BCrypt.checkpw("1231213", hashpw);

        System.out.println(checkpw);

    }

}
