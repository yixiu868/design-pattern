package com.ww.strategy.learn.demo1;

/**
 * 策略模式 维护play算法的实现
 */
public class PlayContext {

    private Game game;

    public PlayContext() {
        this.game = new Default();
    }

    public PlayContext(Game game) {
        this.game = game;
    }

    public void trigger() {
        game.play();
    }
}
