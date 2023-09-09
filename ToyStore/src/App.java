import java.util.ArrayList;
import java.util.List;

import Classes.Toy;
import Classes.View;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Toy t0 = new Toy(0, "lego", 50, 30);
        Toy t1 = new Toy(1, "bear", 50, 30);
        Toy t2 = new Toy(2, "ball", 50, 40);
        Toy t3 = new Toy(3, "doll", 50, 25);
        Toy t4 = new Toy(4, "cube", 50, 25);

        List<Toy> my_list = new ArrayList<Toy>();
        my_list.add(0, t0);
        my_list.add(1, t1);
        my_list.add(2, t2);
        my_list.add(3, t3);
        my_list.add(4, t4);

        // System.out.println(my_list.toString());

        View view = new View(my_list);
        view.run();

    }
}
