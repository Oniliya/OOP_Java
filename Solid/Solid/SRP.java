package OOP_Java.Solid.Solid;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SRP {
    // Базовое задние:
    // 1) Переписать код в соответствии с Single Responsibility Principle:

    public class Employee {

        private String name;
        private Date dob;
        private int id;
        

        // public Employee(String name, Date dob, int baseSalary) {
        public Employee(String name, Date dob, int id) {
            this.name = name;
            this.dob = dob;
            this.id = id;
            // this.baseSalary = baseSalary;
        }

        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }

        public int getId() {
            return id;
        }


    }

    public interface InnerSRP<Employee> {
       Integer calculateNetSalary(Map<Integer, Integer> empl, Integer id); 
    }

    
    public class Salary implements InnerSRP<Employee>{
        private Integer baseSalary;
        private Map<Integer, Integer> map = new HashMap<>();

        public Integer calculateNetSalary(Map<Integer, Integer> empl, Integer id) {
            Integer tax = (int) (baseSalary * 0.25);//calculate in otherway
            return empl.put(id , baseSalary - tax);
            // return baseSalary - tax;
        }

    }

}
