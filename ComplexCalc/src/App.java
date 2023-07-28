import Classes.CalcComplex;
import Classes.Complex;
import Classes.View;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // создаем экземпляр калькулятора
        CalcComplex calc1 = new CalcComplex(new Complex(0, 0));

        // создаем рабочее меню для калькулятора
        View view = new View(calc1);

        // запускаем работу
        view.run();


    }
}
