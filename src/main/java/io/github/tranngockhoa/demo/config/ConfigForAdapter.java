package io.github.tranngockhoa.demo.config;

import io.github.tranngockhoa.demo.phone.Adapter;
import io.github.tranngockhoa.demo.phone.SmartPhone;
import io.github.tranngockhoa.demo.phone.SmartPhoneWithAdapter;
import io.github.tranngockhoa.nasus.api.annotation.Bean;
import io.github.tranngockhoa.nasus.api.annotation.Configuration;

@Configuration
public class ConfigForAdapter {
    @Bean
    public Adapter adapter() {
        return new Adapter();
    }

    @Bean
    public SmartPhoneWithAdapter smartPhoneWithAdapter(SmartPhone smartPhone, Adapter adapter) {
        return new SmartPhoneWithAdapter(smartPhone, adapter);
    }
}
