package Interfaces;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {
    // поведение в магазине

    // переводит клиента в состояние магазин
    void acceptToMarket(iActorBehaviuor actor);

    // уход из магазина
    void releaseFromMarket(List<Actor> actor);

    // переход в следующее положение
    // клиент -- вход в магазин -- выбор -- забрать -- уход
    void update();

    /**
     * метод запись в файл 
     * @param filePath путь к файлу
     * @param text строка для записи в файл
     */
    void writeToFile(String filePath, String text); 

}
