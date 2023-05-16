package io.github.tranngockhoa.demo.server;

import io.github.tranngockhoa.nasus.IoC;
import io.undertow.Undertow;

public class Application {

    public static void main(final String[] args) {
        IoC ioC = IoC.initBeans(Application.class);
        Undertow server = ioC.getBean(Undertow.class);
        server.start();
    }
}