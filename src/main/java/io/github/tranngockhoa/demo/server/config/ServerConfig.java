package io.github.tranngockhoa.demo.server.config;

import io.github.tranngockhoa.demo.server.ClassLoader;
import io.github.tranngockhoa.demo.server.annotation.RequestMapping;
import io.github.tranngockhoa.nasus.IoC;
import io.github.tranngockhoa.nasus.api.annotation.Bean;
import io.github.tranngockhoa.nasus.api.annotation.Configuration;
import io.undertow.Handlers;
import io.undertow.Undertow;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;

import java.util.List;

@Configuration
public class ServerConfig {

    @Bean
    public String handlerPackage() {
        return "io.github.tranngockhoa.demo.server.handler";
    }

    @Bean
    public Undertow getServer(String handlerPackage) {
        List<Class<?>> classesInPackage = ClassLoader.getInstance()
                .getClassesInPackage(handlerPackage);

        RoutingHandler routingHandler = Handlers.routing();
        for (Class<?> aClass : classesInPackage) {
            String path = aClass.getAnnotation(RequestMapping.class).value();
            PathHandler bean = (PathHandler) IoC.context().getBean(aClass);
            routingHandler.get(path, bean);
        }

        return Undertow.builder()
                .addHttpListener(8080, "localhost")
                .setHandler(routingHandler)
                .build();
    }
}
