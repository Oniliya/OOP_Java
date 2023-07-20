package Controllers;

import Domen.Emploee;
import Domen.Person;
import Services.EmploeeService;
//import Services.StudentService;

public class EmploeeController implements iPersonController<Emploee> {
    private final EmploeeService empService = new EmploeeService();
    /**
     * контроллер для работников работат с сервисом (emploee service)
     */
    @Override
    public void create(String firstName, int age) {
        empService.create(firstName,age);
    }

    // метод выплаты зарплаты - дженерик
    // public static <T extends Person> void paySalary(T person)
    // наследовать только от Emploee
    public static <T extends Emploee> void paySalary(T person){
        System.out.println(person.getName()+" выплачена зарплата 10000р. ");
    }
}
