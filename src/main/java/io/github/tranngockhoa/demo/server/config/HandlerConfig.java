package io.github.tranngockhoa.demo.server.config;

import io.github.tranngockhoa.nasus.api.annotation.Bean;
import io.github.tranngockhoa.nasus.api.annotation.Configuration;

@Configuration
public class HandlerConfig {
    @Bean
    public String handlerPackage() {
        return "io.github.tranngockhoa.demo.server.handler";
    }
}
