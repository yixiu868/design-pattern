package com.ww.chain;

public abstract class Manager {

    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    /**
     * 设置继任者
     * @param superior
     */
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}
