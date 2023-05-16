package io.github.tranngockhoa.demo.server.handler;

import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.PathHandler;
import io.undertow.util.Headers;

public class DataHandler extends PathHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "application/json");
        exchange.getResponseSender().send("""
                {
                    "status": "OK",
                    "data": [
                        {
                            "name": "John"
                        }
                    ]
                }
                """);
    }
}
