package Classes;

public class OrdinaryClient extends Actor {
    // private boolean setTakeOrder;
    // private boolean setMakeOrder;

    public OrdinaryClient(String name) {
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



    


    // public boolean isSetTakeOrder() {
    //     return setTakeOrder;
    // }

    // public void setSetTakeOrder(boolean setTakeOrder) {
    //     this.setTakeOrder = setTakeOrder;
    // }

    // public boolean isSetMakeOrder() {
    //     return setMakeOrder;
    // }

    // public void setSetMakeOrder(boolean setMakeOrder) {
    //     this.setMakeOrder = setMakeOrder;
    // }

    // @Override
    // public String getName() {
    //     return name;
    // }
}
