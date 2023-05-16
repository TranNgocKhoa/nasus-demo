package io.github.tranngockhoa.demo.server.config;

import io.github.tranngockhoa.demo.server.handler.HeathHandler;
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
    public HeathHandler heathHandler() {
        return new HeathHandler();
    }

    @Bean
    public RoutingHandler getRoutes(HomeHandler homeHandler, HeathHandler heathHandler) {
        return Handlers.routing()
                .get("/", homeHandler)
                .get("/health", heathHandler);
    }

}
