package Controllers;

import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher>{
    private final TeacherService dataService = new TeacherService();

    /**
     * контроллер для учителей работат с сервисом (Teacher service)
     */

    //Метод регистрации учителя в базе данных
    @Override
    public void create(String firstName, int age) {
        // добавить учителя
        dataService.create(firstName,age);
        // отсортировать учителя
        dataService.sortByFIOTeachLst();
    }

}
