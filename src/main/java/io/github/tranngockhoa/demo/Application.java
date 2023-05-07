package io.github.tranngockhoa.demo;

import io.github.tranngockhoa.demo.phone.SmartPhone;
import io.github.tranngockhoa.demo.phone.SmartPhoneWithAdapter;
import io.github.tranngockhoa.nasus.IoC;
import io.github.tranngockhoa.nasus.api.BeanContainer;

public class Application {
    public static void main(String[] args) {
        BeanContainer ioC = IoC.initBeans(Application.class);

        SmartPhone smartPhone = ioC.getBean(SmartPhone.class);
        smartPhone.check();

        System.out.println("=================");

        SmartPhoneWithAdapter smartPhoneWithAdapter = ioC.getBean(SmartPhoneWithAdapter.class);
        smartPhoneWithAdapter.check();
    }
}
