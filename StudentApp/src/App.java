import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.AverageAge;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);
        // Student s3 = new Student("Иван", 22, 121);
        // Student s4 = new Student("Игорь",  23, 444);
        // Student s5 = new Student("Даша",  23, 171);
        // Student s6 = new Student("Лена",  23, 104);

        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);
        

        // StudentGroup group4580 = new StudentGroup(listStud, 4580);
        // System.out.println(group4580);

        // for(Student std : group4580)
        // {
        //     System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup())
        // {
        //     System.out.println(std);
        // }

        //========================================================================
        // сравним двух студентов
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        // создаем экземпляр класса персон_компаратор для студентов
        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);


        //========================================================================
        // сравним двух учителей
        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");
        // создаем экземпляр класса персон_компаратор для учителей
        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);
      
        // сравнить учителя и студента нельзя, если типы данных разные
        // comS.compare(s1, t2);

        // сравнить учителя и студента можно, если тип одинаковый
        // сравнить их как данные типа персон можно
        // полиморфизм (общие части будут сравниваться)
        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);



        // создаем экземпляр работника
        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        // создаем экземпляр класса эмплое-контролер
        EmploeeController empControll = new EmploeeController();
        // выплатим ему зарплату
        EmploeeController.paySalary(e1);

        // если метод static то можно вызвать его сразу, без создания экземпляра класса
        // без EmploeeController empControll = new EmploeeController();
        // без empControll.paySalary(e1); 
        // (если создан экземпляр класса, что !! обращение к нему (с маленькой буквы))
        // из EmploeeController: -> public static <T extends Emploee> void paySalary(T person)
        EmploeeController.paySalary(e1);
        
        // студент получил зарплату
        // EmploeeController.paySalary(s1);
        // необходимо исключить ошибку (защитить тип)
        // empControll.paySalary(e1);
        // empControll.paySalary(s1);

        //-----------------------------------
        //вывод учителей
        Teacher t3 = new Teacher("Семен Иванович", 35, "Docent");
        Teacher t4 = new Teacher("Игорь Сергеевич", 33, "Professor");
        Teacher t5 = new Teacher("Антон Павлович", 41, "Candidate");
        System.out.println(t3.toString()+"\n"+t4.toString()+"\n"+t5.toString()+"\n");
        // слоздаем список учителей
        List<Teacher> listTeach = new ArrayList<Teacher>();
        listTeach.add(t3);
        listTeach.add(t4);
        listTeach.add(t5);
        // сортируем список по полю firstName
        Collections.sort(listTeach);
        System.out.println(listTeach);

        // среднее арифметическое возрастов учителей
        System.out.println(AverageAge.average(listTeach));

        // создадим список студентов
        Student s11 = new Student("Иван", 22, 121);
        Student s12 = new Student("Игорь", 21, 301);
        Student s13 = new Student("Джон", 19, 121);
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s11);
        listStud.add(s12);
        listStud.add(s13);

         // среднее арифметическое возрастов студентов
        System.out.println(AverageAge.average(listStud));
       




        


    }
}







// 1) Создать класс TeacherService и реализовать аналогично проделанному на семинаре. 
// Подключить обобщенный интерфейс iPersonService. 
// Добавить метод вывода списка учителей отсортированного обобщенным классом PersonComparator

// 2) Создать класс TeacherController. Подключить к классу обобщенный интерфейс iPersonController.

// 3) Разработать обобщенный класс AverageAge для подсчета среднего возраста студентов, 
// учителей и работников. Вывести результат работы класса на консоль.

// (Задача со *) Переписать иерархию Person->Student/Teacher/Emploee в иерархию обобщенных типов.

// Формат сдачи: ссылка на гитхаб проект
