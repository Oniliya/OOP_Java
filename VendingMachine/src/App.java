import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>(); // список продуктов

        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");

        // новый потомок от родителя
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)1.5);

        Product item4 = new Product(200, 4, "Chocolate", 10);
        Product item5 = new Bottle(150, 5, "Spark Water", 102, (float)1.0);

        // добавить несколько горячих напитков
        // int price, int place, String name, long id, int temperatureDrink
        Product item6 = new HotDrink(300, 6, "Hot Drink 1 - Tea", 80);
        Product item7 = new HotDrink(300, 7, "Hot Drink 2 - Coffe", 100);

        
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);

        assort.add(item6);
        assort.add(item7);

        // создаем место для хранения 
        Holder hold1 = new Holder(4, 4);

        // создаем коиндиспансер
        CoinDispenser coinDesp = new CoinDispenser(0);

        // создаем дисплей (некое отображение)
        Display disp = new Display();

        // конструктор вендинг машины
        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        // вывод в консоль продуктов
        for(Product prod: venMachine.getProducts()){
            System.out.println(prod);
        }

        // 
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();

        //System.out.println("Hello, World!");
    }
}
