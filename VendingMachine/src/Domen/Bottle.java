package Domen;

public class Bottle extends Product {
    // Поля
    private float bottleVolume;

    //конструкторы
    public  Bottle(int price, int place, String name, long id){
        super(price,place,name,id);
        this.bottleVolume = 0f;
    }
    public Bottle (int price, int place, String name, long id, float bottleVolume){
        super(price,place,name,id);
        this.bottleVolume = bottleVolume;
    }

    // Свойства
    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }


    @Override
    public String toString() {
        // обращение к родителю класса super если в родителе public, 
        // если privat то через getter напр: getName...
        // return super.toString() + "\nvolume="+bottleVolume ;
        return super.toString() + "volume="+bottleVolume ;

    }

}
