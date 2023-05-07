package io.github.tranngockhoa.demo.phone;

public class Adapter implements Checkable {
    @Override
    public void check() {
        System.out.println("Adapter check: " + this);
    }
}
