// класс логгер для логирования данных
// необходимо добавить логирование без изменения классов (калькулятор маин ..)
// поэтому создается класс декоратор CalcDecorator
public class Logger {
    /**
     * метод логирования
     * @param line строка для логирования
     */
    public void log(String line)
    {
        System.out.println(line);
    }    
}
