package Controller;

import java.util.HashMap;
import java.util.List;
import Model.Student;

// интерфейс со стороны view - только список методов (описание методов для работы)
public interface iGetView {
    /**
     * вывод всех студентов List<Student>
     * @param students список студентов List<Student>
     */
    void printAllStudents(List<Student> students);

    // метод из ViewEng
    void printAllStudentsEng(List<Student> students);
   
    // Метод выводит информацию о каждом студенте на консоль
    void printAllStudent(List<Student> students);

    // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
    String prompt(String msg);

    // Метод для получения id студента, которого нужно удалить.
    Long getStudentIdToDelete();

    // Метод отображает информацию о каждом студенте
    void displayStudents(List<Student> students);

    // Метод для чтения данных о студенте.
    Student readStudent();

    // Метод для получения id студента, которого пользователь хочет обновить.
    Long getStudentIdToUpdate();

    //метод для печати студентов в виде HashMap<Long, Student>
    void printAllHashStudents(HashMap<Long, Student> allHashMapStudents);
    
}














// import java.util.List;
// import Model.Student;

// /**
//  * Интерфейс для создания блока view в модели MVC
//  */
// public interface iGetView {
//     // Метод выводит информацию о каждом студенте на консоль
//     void printAllStudent(List<Student> students);

//     // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
//     String prompt();

//     // Метод для получения id студента, которого нужно удалить.
//     Long getStudentIdToDelete();

//     // Метод отображает информацию о каждом студенте
//     void displayStudents(List<Student> students);

//     // Метод для чтения данных о студенте.
//     Student readStudent();

//     // Метод для получения id студента, которого пользователь хочет обновить.
//     Long getStudentIdToUpdate();
// }