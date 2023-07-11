package Interfaces;

import Classes.Actor;

/**
 * Добавить интерфейс iReturnOrder возврата товара. 
 * Продумать какие методы могут понадобиться 
 * и подключить интерфейс к классам клиентов.
 *   */
public interface iReturnOrder {
    /**
     * поведение клинта, пришедшего сделать возврат
     * (!) сделать возврат и уйти из магазина
     */
    public void updateReturnOrder();

    Actor getActor();

    /**
     * метод запись в файл 
     * @param filePath путь к файлу
     * @param text строка для записи в файл
     */
    void writeToFile(String filePath, String text); 

    
}
