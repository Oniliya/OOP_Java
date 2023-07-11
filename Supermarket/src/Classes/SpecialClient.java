package Classes;

public class SpecialClient extends Actor{
    
  // дополнительный ид для вип клиента
  private int idVip;

  public SpecialClient(String name, Integer id) {
    super(name);
    idVip = id;
  }

  public Actor getActor() {
    return this;
  }

  @Override
  public String getName() {
      return super.name;
  }

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



  // @Override
  // public String getName() {
  //     return name;
  // }

  // public int getIdVip() {
  //     return idVip;
  // }
}
