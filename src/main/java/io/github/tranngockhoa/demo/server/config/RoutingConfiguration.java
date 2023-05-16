package io.github.tranngockhoa.demo.server.config;

import io.github.tranngockhoa.demo.server.handler.HealthHandler;
import io.github.tranngockhoa.demo.server.handler.HomeHandler;
import io.github.tranngockhoa.nasus.api.annotation.Bean;
import io.github.tranngockhoa.nasus.api.annotation.Configuration;
import io.undertow.Handlers;
import io.undertow.server.RoutingHandler;

@Configuration
public class RoutingConfiguration {
    @Bean
    public HomeHandler homeHandler() {
        return new HomeHandler();
    }

    @Bean
    public HealthHandler heathHandler() {
        return new HealthHandler();
    }

    @Bean
    public RoutingHandler getRoutes(HomeHandler homeHandler, HealthHandler healthHandler) {
        return Handlers.routing()
                .get("/", homeHandler)
                .get("/health", healthHandler);
    }

}
