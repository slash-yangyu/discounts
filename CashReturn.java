package com.keesail.klh.discounts;

/**
 * @ClassName : CashRebate
 * @Description : 满减子类
 * @Author : yock
 * @Date: 2020/7/7
 */
public class CashReturn extends CashSuper {
    private final double moneyReturn;
    private final double moneyCondition;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyReturn = moneyReturn;
        this.moneyCondition = moneyCondition;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) money -= Math.floor(money / moneyCondition) * moneyReturn;
        return money;
    }
}
