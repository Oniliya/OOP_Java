
// создадим дженейрик класс для персон
// T и V типя для будущей передачи. 
// тип T для String
// тип V для Integer

/**
 * класс Person от нешо наследуются все остальные
 */
public abstract class Person<T,V> {
    private T name;
    private V age;
    
    public Person(T name, V age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}
