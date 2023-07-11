package Interfaces;

import Classes.Actor;
/**
 * интерфейс для поведения клиента
 */
public interface iActorBehaviuor {
    // вынести в интерфейс методы из классов
    // интерфейсы абстрактные - без реализации (только описание)
    public boolean isTakeOrder() ;
    public boolean isMakeOrder() ;
    public void setTakeOrder(boolean takeOrder) ;
    public void setMakeOrder(boolean makeOrder) ;
    Actor getActor();

    
}
