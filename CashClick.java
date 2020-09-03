package com.keesail.klh.discounts;

/**
 * @ClassName : CashClick
 * @Description : 客户端
 * @Author : yock
 * @Date: 2020/7/7
 */
public class CashClick {
    private static double price = 420;
    private static double count = 3;
    private static double total = 0;


    public static void main(String[] args) {
        CashContext csuper = new CashContext("满减", 100, 50);
        double totalPrices = csuper.getResult(price * count);
        total += totalPrices;
        System.out.println("单价: " + price + "数量: " + Integer.valueOf(count) + " 满减" + "合计: " + total);
    }
}
