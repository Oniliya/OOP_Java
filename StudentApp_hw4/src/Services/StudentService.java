package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.AverageAge;
import Domen.PersonComparator;
import Domen.Student;

public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> students;

    /**
     * сервис для студент контроллер 
     * @count количество
     * @students все студенты
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    // создание студента имя, возраст, ид (из count)
    // запись студента в "базу данных"
    @Override
    public void create(String firstName, int age) {
        Student per = new Student(firstName,age,count);
        count++;
        students.add(per);
    }    

    // метод сортировки студентов по имени
    // сортировка, как любой "инструмент" добавляется к сервисам
    public void sortByFIOStdLst(){
        students.sort(new PersonComparator<Student>());
    }

    // // вычисление среднего возраста
    // public void averageStnAge(List<Student> stnList){
    //     System.out.println(AverageAge.average(stnList));
    // }


}
