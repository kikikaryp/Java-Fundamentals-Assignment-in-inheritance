package service;

import model.Product;

public class SimpleRetailStore implements IStore {

    private double totalBuyBalance = 0;
    private double totalSellBalance = 0;


    public void buy(Product product) {
        double price = product.getPriceWhenBuy();
        totalBuyBalance += price;
    }

    public void sell(Product product) {
        double price = product.getPriceWhenSell();
        totalSellBalance += price;
    }

    public void msg() {
        System.out.print("It seems your expenses exceed your earning.");
    }

    public double getRevenue() {
        double balance = totalSellBalance - totalBuyBalance;

        if (balance < 0)
            msg();

        System.out.println("This is your revenue: ");
        return balance;
    }

    public void setTotalBuyBalance(double totalBuyBalance) {
        this.totalBuyBalance = totalBuyBalance;
    }

    public void setTotalSellBalance(double totalSellBalance) {
        this.totalSellBalance = totalSellBalance;
    }
}
