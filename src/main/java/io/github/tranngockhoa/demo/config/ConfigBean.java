package io.github.tranngockhoa.demo.config;

import io.github.tranngockhoa.demo.phone.*;
import io.github.tranngockhoa.nasus.api.annotation.Bean;
import io.github.tranngockhoa.nasus.api.annotation.Configuration;

@Configuration
public class ConfigBean {

    @Bean
    public Wire wire() {
        return new Wire();
    }

    @Bean
    public Connector connector(Wire wire) {
        return new Connector(wire);
    }

    @Bean
    public Screen screen() {
        return new Screen();
    }

    @Bean
    public Battery battery() {
        return new Battery();
    }

    @Bean
    public SoC soC() {
        return new SoC();
    }

    @Bean
    public SmartPhone smartPhone(Screen screen, Battery battery, SoC soC, Connector connector) {
        return new SmartPhone(screen, battery, soC, connector);
    }
}
