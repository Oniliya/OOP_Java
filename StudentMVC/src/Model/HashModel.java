package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;
// Сделать вариант класса hachModel с хранилищем типа HashMap<Long,Student>
public class HashModel implements iGetModel {
    // хранилище в виде HashMap
    private HashMap<Long, Student> hashStudents;

    /**
     * конструктор класса hashModel с хранилищем типа HashMap<Long,Student>
     * @param hashStudents само хранилище типа HashMap<Long,Student>
     */
    public HashModel(HashMap<Long, Student> hashStudents) {
        this.hashStudents = hashStudents;
    }
    
    // метод, возвращающий список List<Student> студентов
    public HashMap<Long, Student> getAllHashMapStudents(){
        return hashStudents;
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudents'");
    }

    @Override
    public void setAllStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAllStudents'");
    }

    @Override
    public void saveAllStudentToFile(List<Student> newSt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAllStudentToFile'");
    }

}
