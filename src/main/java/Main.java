import model.Product;
import service.*;

public class Main {


    public static void main(String[] args) {

        //Exercise 1
        ServiceAccount.tester1();
        ServiceAccount.tester2();

        //Exercise 3
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(1, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(1, "Chair. Luis XV", 100, 1000);

        IStore simple = new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x4);
        simple.sell(x1);
        System.out.println(simple.getRevenue());

        //Exercise 4

        IStore invStore = new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x4);
        invStore.sell(x1);
        System.out.println(invStore.getRevenue());
        invStore.sell(x2);
        invStore.getInventory();
        //resetting the inventory has everything deleted
        invStore.reset();
        System.out.println(invStore.getRevenue());

    }
}
