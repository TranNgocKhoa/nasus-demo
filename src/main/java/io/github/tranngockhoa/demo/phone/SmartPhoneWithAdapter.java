package io.github.tranngockhoa.demo.phone;

public class SmartPhoneWithAdapter implements Checkable {
    private final SmartPhone smartPhone;
    public final Adapter adapter;

    public SmartPhoneWithAdapter(SmartPhone smartPhone, Adapter adapter) {
        this.smartPhone = smartPhone;
        this.adapter = adapter;
    }


    public void check() {
        System.out.println("SmartPhoneWithAdapter check: " + this);
        smartPhone.check();
        adapter.check();
    }
}
