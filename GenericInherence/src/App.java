import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        // создадим студентов s1 s2 s3
        // передаем при создании точные типы данных Student<String,Integer> вместо параметров T и V
        Student<String,Integer> s1 = new Student<String,Integer>("Сергей", 34 , 101);
        System.out.println(s1);
        Student<String,Integer> s2 = new Student<String,Integer>("Иван", 24 , 102);
        Student<String,Integer> s3 = new Student<String,Integer>("Андрей", 27 , 103);

        // создадим список студентов
        // передаем при создании точные типы данных List<Student<String,Integer>> вместо параметров T и V
        List<Student<String,Integer>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);

        // создадим группу студентов из списка 
        // передаем при создании точные типы данных StudentGroup<String,Integer> вместо T и V
        StudentGroup<String,Integer> group = new StudentGroup<String,Integer>(listStud, "4580");
        
        // возможность использовать цикл for обеспечена итератором в классе
        for(Student<String,Integer> stud :group)
        {
            System.out.println(stud);
        }
    }
}
