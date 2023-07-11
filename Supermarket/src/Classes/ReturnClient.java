package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Interfaces.iReturnOrder;

/**
 * класс клиентов, пришедших с возвратом
 */
public class ReturnClient extends Actor{

    private String name;
    private static String filePath = "log.txt";

    public void setName(String name) {
        this.name = name;
    }

    // конструктор
    public ReturnClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    // вернуть ссылку на себя
    public Actor getActor() {
      return this;
    }   

    // узнать у клиента его положение
    public boolean isTakeOrder() {
        return super.isTakeOrder;
        }
    
    // узнать у клиента его положение
    public boolean isMakeOrder() {
    return super.isMakeOrder;
    }
    
    // установить клиенту его положение
    public void setTakeOrder(boolean makeOder) {
    super.isMakeOrder = makeOder;
    }
        
    // установить клиенту его положение
    public void setMakeOrder(boolean pikUpOrder) {
    super.isTakeOrder = pikUpOrder;
    }

    /**
     * поведение клиента с возвратом:
     * (!)клиент пришел в магазин -> вернуть заказ -> уйти из магазина */    
    public static void acceptToReturn(Actor nameActor) {
        System.out.println(nameActor.getActor().getName()+" клиент пришел в магазин сделать возврат");
        writeToFile(filePath , nameActor.getActor().getName()+" клиент пришел в магазин сделать возврат");
    }

    /**
     * поведение клиента с возвратом:
     * клиент пришел в магазин -> (!)вернуть заказ -> (!)уйти из магазина */      
    public static void updateReturnOrder(Actor nameActor){
       System.out.println(nameActor.getActor().getName()+" клиент сделал возврат товара "); 
       writeToFile(filePath,nameActor.getActor().getName()+" клиент сделал возврат товара");
       System.out.println(nameActor.getActor().getName()+" клиент ушел из магазина ");
       writeToFile(filePath,nameActor.getActor().getName()+" клиент клиент ушел из магазина");
    }

    public static void writeToFile(String myFilePath, String text) {
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
