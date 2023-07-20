package Controllers;

import Domen.Student;
import Services.StudentService;

public class StudentController implements iPersonController<Student> {
    
    private final StudentService dataService = new StudentService();

    /**
     * контроллер для студентов работат с сервисом (student service)
     */

    //Метод регистрации студената в базе данных
    @Override
    public void create(String firstName, int age) {
        // добавить студента
        dataService.create(firstName,age);
        // отсортировать студента
        dataService.sortByFIOStdLst();
    }

}