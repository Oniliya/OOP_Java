package meteo;

        // новый датчик ST500Info и у него другой интерфейс SensorTemperature
        // задача датчик ST500Info сохранить в MeteoStore
        // создаем класс AdapterST500
        // implements MeteoSensor для "имитеции" старого интерфейса

import java.time.LocalDateTime;

public class AdapterST500 implements MeteoSensor {
    // 
    private SensorTemperature adapter;
    
    /**
     * конструктор для адаптера (расширение для старого класса MeteoSensor )
     * @param adapter 
     */
    public AdapterST500(SensorTemperature adapter) {
        this.adapter = adapter;
    }

    
    // -------------------------------
    //  переопределяем все методы
    // -------------------------------
    @Override
    public int getId() {
        return adapter.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)adapter.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adapter.year(), 1, 1, 0, 0);
        dateTime = dateTime.plusDays(adapter.day()-1);
        dateTime = dateTime.plusSeconds(adapter.second());
        return dateTime;
    }
    
    
}
