package Rewards;

// фабрика для гем
public class GemGen extends ItemGen {

    /**
     * конструктор
     */
    @Override
    public iGameItem createItem() {
       return new Gem();
    }
    
}
