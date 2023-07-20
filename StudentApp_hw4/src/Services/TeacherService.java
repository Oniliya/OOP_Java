package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;
import Domen.PersonComparator;
import Domen.Student;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private String acadDegree;
    private List<Teacher> teachers;
    
    /**
     * конструктор для TeacherService
     * @param count количество
     * @param teachers список учителей
     */
    // public TeacherService(List<Teacher> teachers) {
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    // создание учителя имя, возраст, степень
    // запись учителя в "базу данных"
    @Override
    public void create(String firstName, int age) {
        Teacher teach = new Teacher(firstName, age, acadDegree);
        teachers.add(teach);
    }


    // метод сортировки учителей по именам
    // сортировка, как любой "инструмент" добавляется к сервисам
    public void sortByFIOTeachLst(){
        teachers.sort(new PersonComparator<Teacher>());
    }

    

    
}

