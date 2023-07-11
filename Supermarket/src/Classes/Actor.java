package Classes;

import Interfaces.iActorBehaviuor;
/**
 * основной класс Actor для человека пришедшего в магазин
 */
public abstract class Actor implements iActorBehaviuor {
    // имя
    /**
     * @param name имя клиента
     */
    protected String name;

    // флаги для определения позиции клиента
    // клиент -- вход в магазин -- выбор -- забрать -- уход
    // флаги для определения вызова фуйнкций
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    // конструктор только для имени
    public Actor(String name) {
        this.name = name;
    }
    
    // один абстрактный метод  
    abstract public String getName();


}
