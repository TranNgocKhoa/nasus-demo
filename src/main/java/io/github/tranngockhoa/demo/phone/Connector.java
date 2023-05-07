package io.github.tranngockhoa.demo.phone;

public class Connector implements Checkable {
    private final Wire wire;

    public Connector(Wire wire) {
        this.wire = wire;
    }

    @Override
    public void check() {
        System.out.println("Connector check: " + this);
        wire.check();
    }
}
