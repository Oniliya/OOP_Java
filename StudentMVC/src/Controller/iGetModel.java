package Controller;

import java.util.HashMap;
import java.util.List;
import Model.Student;

// интерфейс со стороны модели - только описание методов для работы (список методов)
public interface iGetModel {
    /**
     * метод, возвращающий список студентов
     * @return возвращает List<Student>
     */
    public List<Student> getAllStudents();  
    
    /**
     * метод, возвращающий HashMap студентов
     * @return возвращает HashMap<Long, Student>
     */
    public HashMap<Long, Student> getAllHashMapStudents();

    public void setAllStudents(List<Student> students);

    public void saveAllStudentToFile(List<Student> newSt);
}
