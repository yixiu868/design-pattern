package com.ww.strategy;

public class Context {

    private Strategy strategy;

    public Context(String type, Double money, Double subMoney, Double discount) {
        switch (type) {
            case "折扣":
                strategy = new StrategyB(money, discount);
                break;
            case "满减":
                strategy = new StrategyC(money, subMoney);
                break;
            default:
                strategy = new StrategyA(money);
                break;
        }
    }

    public Double getResult() {
        return strategy.getResult();
    }
}
