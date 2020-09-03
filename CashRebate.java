package com.keesail.klh.discounts;

/**
 * @ClassName : CashRebate
 * @Description : 折扣子类
 * @Author : yock
 * @Date: 2020/7/7
 */
public class CashRebate extends CashSuper {
    private final double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
