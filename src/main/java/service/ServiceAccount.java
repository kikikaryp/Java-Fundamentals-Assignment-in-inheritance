package service;

import model.Category;

public class ServiceAccount {

    //testing the methods of the Account class
    public static void tester1() {

        Account account = new Account("Kwstas", 3100, 3);
        System.out.println("Amount of money deposited: " + account.deposit(200));
        System.out.println("Amount of money withdrawn: " + account.withdraw(100));

    }

    //testing the methods of the StoreAccount subclass
    public static void tester2(){

        StoreAccount storeAccount = new StoreAccount("Dimitris", 10000, 4 , "Peiraiws", Category.MID);
        System.out.println("Amount of money deposited: " + storeAccount.deposit(500));
        System.out.println("Amount of money withdrawn: " + storeAccount.withdraw(200));
        System.out.println("Category of the Account after change: " + storeAccount.changeCategory(Category.EXTRA));


    }
}
