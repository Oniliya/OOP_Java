package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    /**
     * поведение внутри магазина при входе
     * встать в очередь*/
    void takeInQueue(iActorBehaviuor actor);

    /**
     * поведение внутри магазина
     * уйти из очереди*/
    void releaseFromQueue();

    /**
     * сделать заказ
     */
    void takeOrder();

    /**
     * получить заказ
     */
    void giveOrder();

    /**
     * вернуть заказ
     */
    void returnOrder();
}
