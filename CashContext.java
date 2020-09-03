package com.keesail.klh.discounts;

import cn.hutool.core.util.ArrayUtil;

/**
 * @ClassName : CashContext
 * @Description : 策略，工厂
 * @Author : yock
 * @Date: 2020/7/7
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type, double... doubles) {
        double[] clone = doubles.clone();
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满减":
                cashSuper = new CashReturn(clone[0], clone[1]);
                break;
            case "打折":
                cashSuper = new CashRebate(clone[0]);
                break;
            case "赠饮":
                System.out.println("暂无赠饮活动");
                cashSuper = new CashNormal();
                break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
