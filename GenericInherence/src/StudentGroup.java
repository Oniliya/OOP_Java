import java.util.Iterator;
import java.util.List;

/**
 * Дженерик класс группа студентов(наследников класса Персон)
 * тип T для String
 * тип V для Intrger
 */

public class StudentGroup<T extends Comparable<T>,V> implements Iterable<Student<T,V>> {
    private List<Student<T,V>> group;
    private T idGroup;
    /**
     * конструктор для группы студентов
     * @param group свое поле Массив студентов List<Student<T,V>>
     * @param string свое поле ИД группы
     */
    public StudentGroup(List<Student<T,V>> group, T string) {
        this.group = group;
        this.idGroup = string;
    }

    public List<Student<T,V>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<T,V>> group) {
        this.group = group;
    }

    public T getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(T idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    /**
     * итератор для группы студентов (нужен чтобы в циклах for использовать свой тип данных)
     */
    @Override
    public Iterator<Student<T,V>> iterator() {
       return new Iterator<Student<T,V>>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<group.size()){
                return true;
            }
            else{
                return false;
            }            
        }

        @Override
        public Student<T,V> next() {            
            return group.get(counter++);
        }
       };
        
    }
    
    
}
