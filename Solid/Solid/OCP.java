package OOP_Java.Solid.Solid;

public class OCP {
    // 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

    public class SpeedCalculation {
        public double calculateAllowedSpeed(Vehicle vehicle) {
          return vehicle.getMaxSpeed();
        }
    }


    public class Vehicle {
        double maxSpeed;
        String type;
        public Vehicle(double maxSpeed, String type) {
          this.maxSpeed = maxSpeed;
          this.type = type;
        }
        public double getMaxSpeed() {
           return this.maxSpeed;
        }
        public String getType() {
          return this.type;
        }
    }

    public class Car extends Vehicle{

        public Car(double maxSpeed, String type) {
            super(maxSpeed*0.8, type);
            //TODO Auto-generated constructor stub
        }

    }

    public class Bus extends Vehicle{

        public Bus(double maxSpeed, String type) {
            super(maxSpeed*0.6, type);
            //TODO Auto-generated constructor stub
        }

    }


    // Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). 
    // Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP
}
