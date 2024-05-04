package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Properties;

@Slf4j
public class ClassPathResourceExample {

    public static void main(String[] args) {

        classPathResourceExample();
        classPathResourceExample2();
    }

    @SneakyThrows
    private static void classPathResourceExample() {
        val classPathResource = new ClassPathResource("generator-config.properties");
        val properties = new Properties();
        properties.load(classPathResource.getStream());
        log.info("打印properties内容：{}", properties);
    }


    @SneakyThrows
    private static void classPathResourceExample2() {
        val classPathResource = new ClassPathResource("generator.xml");

        @Cleanup val in = classPathResource.getStream();
        @Cleanup val out = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
        log.info("打印XML内容：{}", IoUtil.toStr(out, Charset.defaultCharset()));
    }


}
