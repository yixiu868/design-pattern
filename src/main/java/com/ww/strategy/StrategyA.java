package com.ww.strategy;

/**
 * 原价策略
 */
public class StrategyA implements Strategy {

    private Double money;

    public StrategyA(Double money) {
        this.money = money;
    }

    @Override
    public Double getResult() {
        return money;
    }
}
