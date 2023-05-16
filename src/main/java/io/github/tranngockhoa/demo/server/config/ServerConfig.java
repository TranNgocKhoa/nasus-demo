package io.github.tranngockhoa.demo.server.config;

import io.github.tranngockhoa.nasus.api.annotation.Bean;
import io.github.tranngockhoa.nasus.api.annotation.Configuration;
import io.undertow.Undertow;
import io.undertow.server.RoutingHandler;

@Configuration
public class ServerConfig {
    @Bean
    public Undertow getServer(RoutingHandler routingHandler) {
        return Undertow.builder()
                .addHttpListener(8080, "localhost")
                .setHandler(routingHandler)
                .build();
    }
}
