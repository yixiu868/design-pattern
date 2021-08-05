package com.ww.decorator;

public abstract class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (null != component) {
            component.operation();
        }
    }
}
