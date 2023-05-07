package io.github.tranngockhoa.demo.phone;

public class Battery implements Checkable {
    @Override
    public void check() {
        System.out.println("Battery check: " + this);
    }
}
