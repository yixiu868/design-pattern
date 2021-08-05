package com.ww.strategy.learn.demo1;

public class UninstallContext {

    private Game game;

    public UninstallContext() {
        this.game = new Default();
    }

    public UninstallContext(Game game) {
        this.game = game;
    }

    public void trigger() {
        game.uninstall();
    }
}
