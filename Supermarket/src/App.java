import Classes.ActionClient;
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.ReturnClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;



public class App {

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // создаем экземпляр магазина
        Market magnit = new Market();

        // создаем обычного клиента
        // Actor cli1 = new OrdinaryClient("Borya");
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        
        // создаем вип клиента
        // Actor cli2 = new SpecialClient("presid", 111);
        iActorBehaviuor client2 = new SpecialClient("prezident",1001);

        // создаем нового клиента пенсионера
        // Actor p1 = new PensionerClient("Sergey Nikol", 112210);
        iActorBehaviuor p = new PensionerClient("Sergey Nikolay",1111);

        // новый клиент налоговый агент
        iActorBehaviuor tax = new TaxService();

        // magnit.acceptToMarket(cli1);
        // magnit.acceptToMarket(cli2);
        // magnit.acceptToMarket(p1);

        // magnit.update();

        System.out.println("----------------------");


        // новый акционный клиент 
        iActorBehaviuor client3 = new ActionClient("акционный клиент 1", "акция молоко", 1);

        //клиент возвращающий товар
        Actor client4 = new ReturnClient("Клиент с возвратом 1");
        ReturnClient.acceptToReturn(client4);
        ReturnClient.updateReturnOrder(client4);



        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);
        

        magnit.acceptToMarket(client3);
        
        System.out.println("----------------------------");
        magnit.update();
    }
}
