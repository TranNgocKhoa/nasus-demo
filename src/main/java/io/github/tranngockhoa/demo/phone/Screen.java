package io.github.tranngockhoa.demo.phone;

public class Screen implements Checkable {
    @Override
    public void check() {
        System.out.println("Screen check: " + this);
    }
}
