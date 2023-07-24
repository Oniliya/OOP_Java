package Model;

public class Student extends Person implements Comparable<Student> {

    private int id;
    /**
     * конструктор класса Student
     * @param name общее поле от Персон - имя
     * @param age общее поле от Персон - возраст
     * @param id свое поле id
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }


    /**
     * компаратор для студентов, для сравнения по возрасту
     * при одинаковом возрасте - равнение по id
     */
    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1;        
    }


    
    
    
}


