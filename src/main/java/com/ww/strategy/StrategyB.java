package com.ww.strategy;

/**
 * 折扣策略
 */
public class StrategyB implements Strategy {

    private Double money;

    private Double discount;

    public StrategyB(Double money, Double discount) {
        this.money = money;
        this.discount = discount;
    }

    @Override
    public Double getResult() {
        return money * discount;
    }
}
