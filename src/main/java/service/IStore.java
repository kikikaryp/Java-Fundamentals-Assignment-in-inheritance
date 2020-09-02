package service;

import model.Product;

public interface IStore {

    void buy(Product product);

    void sell(Product product);

    double getRevenue();

    default void getInventory() {};

    default void reset(){};

}
