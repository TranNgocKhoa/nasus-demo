package io.github.tranngockhoa.demo.server.handler;

import io.github.tranngockhoa.demo.server.annotation.RequestMapping;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.PathHandler;
import io.undertow.util.Headers;

@RequestMapping("/health")
public class HealthHandler extends PathHandler {
    @Override
    public void handleRequest(final HttpServerExchange exchange) {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
        exchange.getResponseSender().send("OK");
    }
}
