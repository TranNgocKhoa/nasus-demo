package io.github.tranngockhoa.demo.phone;

public class Wire implements Checkable {

    @Override
    public void check() {
        System.out.println("Wire check: " + this);
    }
}
