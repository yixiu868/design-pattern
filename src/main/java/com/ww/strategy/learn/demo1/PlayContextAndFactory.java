package com.ww.strategy.learn.demo1;

/**
 * 利用工厂模式的思想，实现策略模式
 */
public class PlayContextAndFactory {

    private Game game;

    public PlayContextAndFactory() {
        this.game = new Default();
    }

    public PlayContextAndFactory(String name) {
        switch (name) {
            case "hdl":
                game = new Hundouluo();
                break;
            case "mxt":
                game = new Maxituan();
                break;
            default:
                game = new Default();
                break;
        }
    }

    public void trigger() {
        game.play();
    }

    public static void main(String[] args) {
        new PlayContextAndFactory("hdl").trigger();
        new UninstallContext(new Hundouluo()).trigger();
        new PlayContextAndFactory("mxt").trigger();
        new UninstallContext(new Maxituan()).trigger();
    }
}
