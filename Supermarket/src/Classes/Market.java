package Classes;

import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Interfaces.iActorBehaviuor;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehaviour,iReturnOrder {
//  public class Market implements iMarketBehaviour,iQueueBehaviour {
    // private List<Actor> queue;
    private List<iActorBehaviuor> queue;
    private String filePath = "log.txt";

    public Market() {
        this.queue = new ArrayList<iActorBehaviuor>();
    }

    /**
     * поведение клиента в магазине:
     * (!)приход в магазин -> постановка в очередь
     */
    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        writeToFile(filePath, actor.getActor().getName()+" клиент пришел в магазин \n");

        takeInQueue(actor);
    }

    /**
     * поведение клиента в магазине:
     * приход в магазин -> (!)постановка в очередь
     */
    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
        writeToFile(filePath, actor.getActor().getName()+" клиент добавлен в очередь \n");
    }

    /**
     * обычное поведение клиента в магазине:
     * заказать -> взять заказ -> уйти из магазина
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * часть поведения клиента в магазине
     * (!) сделать заказ
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviuor actor:queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
                writeToFile(filePath, actor.getActor().getName()+" клиент сделал заказ \n");
            }
        }
    }

    /**
     * часть поведения клиента в магазине
     * (!) получить заказ
     */
    @Override
    public void giveOrder() {
        for(iActorBehaviuor actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
                writeToFile(filePath, actor.getActor().getName()+" клиент получил свой заказ \n");
            }
        }
    }

        /**
     * часть поведения клиента в магазине
     * (!) уйти из очереди после получения заказа
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviuor actor:queue){
        if(actor.isTakeOrder()){
           releaseActors.add(actor.getActor());
           System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
           writeToFile(filePath, actor.getActor().getName()+" клиент ушел из очереди \n");
           }
        }
        releaseFromMarket(releaseActors);
    }

        /**
     * часть поведения клиента в магазине
     * (!) уйти из магазина
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors){
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            writeToFile(filePath, actor.getActor().getName()+" клиент ушел из магазина \n");
            queue.remove(actor);
        }
    }

    @Override
    public void writeToFile(String myFilePath, String text) {
        // TODO Auto-generated method stub
        File file = new File(myFilePath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
            fr.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                fr.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
