package com.fxytb.malltinyboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.fxytb.malltinyboot.dao", "com.fxytb.malltinyboot.dao.mbg"})
public class MybatisConfig {
}
