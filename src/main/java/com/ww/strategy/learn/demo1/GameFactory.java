package com.ww.strategy.learn.demo1;

/**
 * 简单工厂模式
 */
public class GameFactory {

    public static Game getGame(String name) {
        switch (name) {
            case "hdl":
                return new Hundouluo();
            case "mxt":
                return new Maxituan();
            default:
                return new Default();
        }
    }

    public static void main(String[] args) {
        getGame("mxt").play();
        getGame("mxt").uninstall();
    }
}
