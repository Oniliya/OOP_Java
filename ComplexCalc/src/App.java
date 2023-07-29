import Classes.CalcComplex;
import Classes.CalcDecorator;
import Classes.Complex;
import Classes.Logger;
import Classes.View;
import Interfaces.iCalcComplex;


public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // создаем экземпляр калькулятора
        iCalcComplex calc1 = new CalcComplex(new Complex(0, 0));

        // создаем рабочее меню для калькулятора
        // View view = new View(calc1);



        iCalcComplex newCalcDecor = new CalcDecorator(calc1, new Logger());
        // iCalcComplex newCalcDecor = new CalcDecorator(calc1);
        View view = new View(newCalcDecor);

        // запускаем работу
        view.run();


    }
}
