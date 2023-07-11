package Classes;

// 1) Добавить класс, описывающий акционного клиента. 
// Включить поле название акции, 
// id клиента 
// и количество участников в акции(поле статическое)

/**
 * класс акционного клиента
 */
public class ActionClient extends Actor {
    public String actionName;
    private int idActionClient;
    static public int countActionClient;
    /**
     * @param actionName имя клиента
     * @param idActionClient ИД клиента
     * @param countActionClient количество участников в акции
     */

    /**
     * конструктор для акционного клиента
     */
    public ActionClient(String name, String actionName, int idActionClient) {
        super(name +  " - акционный клиент для акции " + actionName);
        this.actionName = actionName;
        this.idActionClient = idActionClient;
    }

    // get set для idActionClient клиента
    public void setIdActionClient(int idActionClient) {
        this.idActionClient = idActionClient;
    }
    // get set для idActionClient клиента
    public int getIdActionClient() {
        return idActionClient;
    }

    @Override
    public String getName() {
        return super.name;
    }

    // методы
    public boolean isTakeOrder() {
        return super.isTakeOrder;
      }
  
      public boolean isMakeOrder() {
        return super.isMakeOrder;
      }
  
      public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
      }
      
      public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
      }
  
      public Actor getActor() {
        return this;
      }
      

    
}
