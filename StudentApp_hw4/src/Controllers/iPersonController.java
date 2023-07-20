package Controllers;

import Domen.Person;

public interface iPersonController<T extends Person> {
    /**
     * интерфейс 
     */
    void create(String firstName, int age);    
    /**
     * метод создания экземпляра класса Т
     */
}
