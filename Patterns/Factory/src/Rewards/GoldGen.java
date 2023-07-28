package Rewards;

// фабрика
// фабрика производит "золото"
public class GoldGen extends ItemGen {

    /**
     * конструктор
     */
    @Override
    public iGameItem createItem() {
       return new Gold();
    }
    
}
