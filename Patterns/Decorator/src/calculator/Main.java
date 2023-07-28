
// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        iCalculable calculator = new Calculator(0);

        // создаем новый скалькулятор, основанный на новом классе, берем CalcDecorator и добавляем к нему логгер
        iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());
        
        // ViewCalculator view = new ViewCalculator(calculator);
        
        // теперь передаем во view новый калькулятор
        ViewCalculator view = new ViewCalculator(newCalcLog);

        view.run();
    }
}
