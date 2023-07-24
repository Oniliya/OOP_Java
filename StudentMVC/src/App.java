import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HashModel;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        //        
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей",  21, 101);
        Student s2 = new Student("Андрей",  22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша",  25, 171);
        Student s6 = new Student("Лена",  23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        // // создаем модель
        // ModelList model0 = new ModelList(students);
        // // создадим view
        // View view0 = new View();
        // // создадим контроллер
        // Controller control0 = new Controller(model0, view0);
        // // запуск контроллера
        // control0.update();

        // после добавления (появления) интерфейсов необходимо создать экземпляры интерфесов
        // iGetModel и iGetView
        // и добавить implements в классы View и ModelList
        // ... View implements iGetView
        // ... ModelList implements iGetModel

        // создаем файл со списком студентов
        ModelFile fModel = new ModelFile("StudentDB.txt");
        // fModel.saveAllStudentToFile(students);
        // 
        iGetModel modelFile = fModel;
        iGetModel model = new ModelList(students);
        iGetView view = new View();
        iGetView view2 = new ViewEng();

        Controller control = new Controller(modelFile, view);

        Controller control2 = new Controller(modelFile, view2);

        //control.update();
        // запускаем контроллер уже с ожиданием команд от пользователя (интерактив с пользователем)
        
        //  вывод на английском
        control2.update();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // создаем ханилище студентов hashMap
        HashMap<Long, Student> myHashMapStudent = new HashMap<Long, Student>();
        myHashMapStudent.put((long) 0, s1);
        myHashMapStudent.put((long) 1, s2);
        myHashMapStudent.put((long) 2, s3);
        myHashMapStudent.put((long) 3, s4);
        myHashMapStudent.put((long) 4, s5);
        myHashMapStudent.put((long) 5, s6);

        // создаем модель
        HashModel model2 = new HashModel(myHashMapStudent);
        // создаем контроллер
        Controller control3 = new Controller(model2, view);
        // запускаем контроллер
        // control3.printHashMap();

        control.run();


    }
}
