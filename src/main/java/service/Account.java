package service;

public class Account {

    private String owner;
    private double balance;
    private int numberOfTransactions;

    public Account(String owner, double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }

    //there might not be enough money to withdraw
    public int withdraw(int takenMoney) {

        if (this.balance < 0 || (this.balance - takenMoney) < 0)
            System.out.println("We are sorry, the procedure cannot continue due to insufficient balance.");
        else {
            this.balance -= takenMoney;
            System.out.println(takenMoney + "$ withdrawn");
        }
        return takenMoney;
    }

    public int deposit(int money) {
        System.out.println(money + "$ deposited");
        this.balance += money;
        return money;

    }

}
