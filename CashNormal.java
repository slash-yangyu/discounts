package com.keesail.klh.discounts;

/**
 * @ClassName : CashNormal
 * @Description : 正常收费
 * @Author : yock
 * @Date: 2020/7/7
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
