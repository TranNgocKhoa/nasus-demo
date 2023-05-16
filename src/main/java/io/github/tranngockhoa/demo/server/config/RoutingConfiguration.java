package io.github.tranngockhoa.demo.server.config;

import io.github.tranngockhoa.demo.server.handler.DataHandler;
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
    public DataHandler dataHandler() {
        return new DataHandler();
    }

    @Bean
    public RoutingHandler getRoutes(HomeHandler homeHandler, HealthHandler healthHandler, DataHandler dataHandler) {
        return Handlers.routing()
                .get("/", homeHandler)
                .get("/health", healthHandler)
                .get("/data", dataHandler);
    }

}
