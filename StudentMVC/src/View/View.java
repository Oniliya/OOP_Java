package View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;


// основной класс view пока только печать всех студентов
// ... может потом, например, создавать html или скрипты или ....
// ---------

public class View implements iGetView {
    // метод печати всех студентов 
    // принимает List<Student>
    /**
     * метод печати всех студентов , принимает List<Student>     
     * */
    public void printAllStudents(List<Student> students){
        System.out.println("------список студентов--------");
        for(Student stud: students) {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public void printAllStudent(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAllStudent'");
    }

    // метод prompt для получения команд из консоли от пользователя
    @Override
    public String prompt(String msg) {
       Scanner in = new Scanner(System.in);
       System.out.print(msg);
       return in.nextLine();
    }

    @Override
    public Long getStudentIdToDelete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToDelete'");
    }

    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }

    @Override
    public void printAllStudentsEng(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAllStudentsEng'");
    }

    @Override
    public void printAllHashStudents(HashMap<Long, Student> allHashMapStudents) {
        System.out.println("***********************");
        System.out.println(allHashMapStudents);
        // for (Map.Entry entry : allHashMapStudents.entrySet()) {
        //     System.out.println(entry.getValue()+" "+ entry.getKey());
        // }
        System.out.println("***********************");
    }
    
}
