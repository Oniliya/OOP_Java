package Rewards;

// прототип фабрики
public abstract class ItemGen{

    // метод "открыть сундук"
    public void openReward(){
        // создаем экземпляр "продукта фабрики"
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    // метод создания "продукта" на "фабрике"
    public abstract iGameItem createItem();
}