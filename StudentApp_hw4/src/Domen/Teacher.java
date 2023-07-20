package Domen;

public class Teacher extends Person implements Comparable<Teacher>{
    private String acadDegree;
    /**
     * класс teacher от персон для учителя
     * @param firstName имя (общее поле)
     * @param age возраст (общее поле)
     * @param acadDegree звание (свое поле)
     */
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
    
    /**
     * вывод Teacher строкой на экран
     */
    @Override
    public String toString() {
        return "Teacher [ name = "+ super.getName() 
                + " aage = " + super.getAge() 
                + " acadDegree= " + acadDegree + "]";
    }


    /**
     * для сортировки учителей по именам
     * compareTo
     * @param o с чем сравнить
     * @return
     */
    @Override
    public int compareTo(Teacher o) {
        return super.getName().compareTo(o.getName());
    }

}
