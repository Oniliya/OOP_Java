package Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import Controller.iGetModel;

// модель - список студентов - хранилище, view - отображает хранилище

public class ModelList implements iGetModel, Iterable<Student>{
    // поле - хранилище студентов
    private List<Student> students;

    /**
     * конструктр класса ModelList 
     * @param students список студентов для конструктора
     */
    public ModelList(List<Student> students) {
        this.students = students;
    }

    // метод, возвращающий список List<Student> студентов
    public List<Student> getAllStudents(){
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    

    @Override
    public HashMap<Long, Student> getAllHashMapStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllHashMapStudents'");
    }


    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
        
        private int counter;
        @Override
        public boolean hasNext() {
            if(counter<students.size()){
                return true;
            }
            else{
                return false;
            }            
        }
        @Override
        public Student next() {            
            return students.get(counter++);
        } 
       };       
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
