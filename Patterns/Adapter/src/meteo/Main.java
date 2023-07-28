package meteo;

// Проект Adapter: Включить датчик от другой компании,
// интерфейс которого отличается от предыдущих, в систему.
// Первоначальный интерфейс MeteoSensor, адаптируем
// SensorTemperature.

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        // создаем хранилище данных
        // база сохраняет экземпляр интерфейса MeteoSensor
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);// старый датчик // MeteoSensor интерфейс
        meteoDb.save(ms200_1); // сохранение данный с датчика // сохранение интерфейса


        //  новый датчик ST500Info и у него другой интерфейс SensorTemperature
        // задача датчик ST500Info сохранить в MeteoStore
        //  создаем класс AdapterST500

        // создаем новый сенсор температур
        SensorTemperature newSensor = new ST500Info().getData();

        // создаем адаптер 
        AdapterST500 adapter = new AdapterST500(newSensor);
        // сохраняем в базу , возможно так как AdapterST500 implements MeteoSensor
        meteoDb.save(adapter);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
    }
}