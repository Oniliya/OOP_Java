package OOP_Java.Solid.Solid;

public class DIP {
    // 5) Переписать код в соответствии с Dependency Inversion Principle:

    public class Car implements iStartEngine{
        // private PetrolEngine engine;
        private String carType;

        public Car(String carType) {
            this.carType = carType;
        }

        @Override
        public void start() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'start'");
        }

        // public void start() {
        //     this.engine.start();
        // }
    }

    public class PetrolEngine {
        public void start() {
        }
    }

    public class DieselEngine {
        public void start(){
        }
    }

    public interface iStartEngine {
        public void start();
    }
// Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.

}
