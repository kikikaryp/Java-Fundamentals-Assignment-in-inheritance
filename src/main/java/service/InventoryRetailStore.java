package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore extends SimpleRetailStore {


    private List<Product> productList;

    public InventoryRetailStore() {
        productList = new ArrayList<Product>();
    }

    public void reset()
    {
        productList.clear();
        setTotalBuyBalance(0);
        setTotalSellBalance(0);
    }


    public void buy(Product product) {

        super.buy(product);
        productList.add(product);
    }

    public void sell(Product product) {

        if(productList.contains(product))
        {
            super.sell(product);
            productList.remove(product);
        }else {
            System.out.println("\"" + product.getName() + "\"" + " is not in your inventory.");
        }

    }

    public double getRevenue() {

        return super.getRevenue();
    }

    public void getInventory(){

        StringBuilder sb = new StringBuilder();

        sb.append("The inventory has the following products: \n");

        for(Product product: productList){
            sb.append("ID: " + product.getId());
            sb.append(" Name: " + product.getName());
            sb.append(" PriceWhenBuy: " + product.getPriceWhenBuy());
            sb.append(" PriceWhenSell: " + product.getPriceWhenSell());
        }

        System.out.println(sb);
    }
}
