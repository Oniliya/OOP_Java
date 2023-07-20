package Domen;

public class Emploee extends Person{
    private String special;
    /**
     * класс работник (специальность)
     * @param firstName имя (общее поле)
     * @param age возраст (общее поле)
     * @param special специальность (свое поле)
     */
    public Emploee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
