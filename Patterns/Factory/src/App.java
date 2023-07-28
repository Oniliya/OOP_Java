import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Rewards.GemGen;
import Rewards.GoldGen;
import Rewards.ItemGen;
import Rewards.iGameItem;

public class App {
    public static void main(String[] args) throws Exception {

        Random rnd = ThreadLocalRandom.current();

        // лист фабрик (обязательно для фабрик)
        List<ItemGen> generators = new ArrayList<ItemGen>();

        // добавим созданную фабрику "золота"
        generators.add(new GoldGen());
        // добавим созданную фабрику "гем" (два новых файла)
        generators.add(new GemGen());

        for(int i=0;i<10;i++) {
            // iGameItem item = generators.get(0).createItem();
            // item.open();
            
            // generators.get(0).createItem().open();
            // generators.get(1).createItem().open();

            generators.get(Math.abs(rnd.nextInt()%2==0?0:1)).createItem().open();           
        }
    }
}
