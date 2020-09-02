package service;

import model.Category;

public class StoreAccount extends Account{

        private String storeName;
        private Category accountCategory;


    public StoreAccount(String owner, double balance, int numberOfTransactions, String storeName, Category accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }


    public Category changeCategory(Category category)
    {
        this.accountCategory = category;
        return this.accountCategory;
    }
}
