package com.caicode.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.caicode.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}
