
// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        // создаем калькулятор
        iCalculable calculator = new Calculator(0);

        // передаем его во view
        // ViewCalculator view = new ViewCalculator(calculator);


        // создаем новый скалькулятор, основанный на новом классе, берем CalcDecorator и добавляем к нему логгер
        iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());
        
        // теперь передаем во view новый калькулятор
        ViewCalculator view = new ViewCalculator(newCalcLog);

        view.run();
    }
}
