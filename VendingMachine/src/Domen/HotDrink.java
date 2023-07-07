package Domen;

public class HotDrink extends Product {
    private int temperatureDrink;

    @Override
    public String toString() {
        // return "HotDrink [temperatureDrink=" + temperatureDrink + "]";
        return super.toString() + "temperatureDrink=" + temperatureDrink;
    }

    
    // конструкторы
    public HotDrink(int temperatureDrink) {
        this.temperatureDrink = temperatureDrink;
    }

    public HotDrink(int price, int temperatureDrink) {
        super(price);
        this.temperatureDrink = temperatureDrink;
    }

    public HotDrink(int price, int place, int temperatureDrink) {
        super(price, place);
        this.temperatureDrink = temperatureDrink;
    }

    public HotDrink(int price, int place, String name, int temperatureDrink) {
        super(price, place, name);
        this.temperatureDrink = temperatureDrink;
    }

    public HotDrink(int price, int place, String name, long id, int temperatureDrink) {
        super(price, place, name, id);
        this.temperatureDrink = temperatureDrink;
    }

    // get set
    public void setTemperatureDrink(int temperatureDrink) {
        this.temperatureDrink = temperatureDrink;
    }

    public int getTemperatureDrink() {
        return temperatureDrink;
    }





    
    
}
