package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Model.HashModel;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;


// контролеер для модели у него обязательно два поля modelи view, 
// контролеер - владелец модели и вью
public class Controller {
    // private ModelList model; //модель
    // private View view; //вью
    private HashModel model2;

    private iGetModel model; //модель - нужен iGetModel когда появился интерфейс
    private iGetView view; //вью - нужен iGetView когда появился интерфейс

    // данные о студенте для презентера
    private List<Student> students = new ArrayList<>();

    /**
     * конструктор контроллера
     * @param model поле модель model
     * @param view поле вью view
     */
    // public Controller(ModelList model, View view) {
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    public Controller(HashModel model, iGetView view2) {
        this.model = model;
        this.view = view2;        
    }

    // приватный метод (внутренний)
    // что-то может делать внутри контроллера-презентера
    private boolean testData(List<Student> students) {
        if(students.size()>0) {
            return true;
        }
        else {
            return false;
        }
    }
    // метод для соединения всего
    public void update() {
        // MVP
        // переделываем модель в MVP , необходимо хранилище для данных
        // необходимо "разорвать" связь между моделью и вью (напрямую выход из модели передается во вью)
        
        // надо куда-то положить данные о студенте для презентера
        // выше private List<Student> students = new ArrayList<>();
        // данные от модели сначала кладем во внутреннее "хранилище", не сразу отдаем вью
        students = model.getAllStudents(); //своего рода буферное хранилище данных от модели

        // проверяем полученные от вью данные нашим приватным методом внутри контроллера-презентера
        if(testData(students)) {
           view.printAllStudents(students);  
           view.printAllStudentsEng(students);
        }
        else {
            System.out.println("Список студентов пуст!");
        }

        // модель MVC вызываем у view printAllStudents внутрь передаем getAllStudents
        // соединение view и model напрямую
        // модель получает апдайт и соединяет из вместе
        // MVC
        // view.printAllStudents(model.getAllStudents());
    }

    // метод получающий команды, выполняет логику в зависимости от них

    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while(getNewIteration) {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com) {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    String commandId = view.prompt("Введите id студента для удаления: ");
                    Integer idNum = Integer.valueOf(commandId);
                    model.saveAllStudentToFile(studenIdForDelete(model.getAllStudents(), idNum));
                    view.printAllStudents(model.getAllStudents());
                    break;
            }

        }
    }
    /**
     * метод удаления указанного студента из списка студентов
     * если нет возвращает тот же список и сообщение, что
     * нет такого студента, с указанным id для удаления
     * @param students список
     * @param delId Id удаляемого
     */
    private List<Student> studenIdForDelete(List<Student> students, Integer delId) {
        boolean fl = false;
        for (Student student : students) {
            if (student.getId()==delId) {
                fl=true;
                break;
            }
        }
        if (fl) {
            // System.out.println(delId+"\n");
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId()==delId){
                    students.remove(i);
                }    
            }
            System.out.println("Студент с id="+delId+" удален");
        }
        else {
            System.out.println("Студент с id="+delId+" не существует");
        }
        return students;
    }


    //вывод на экран 
    public void printHashMap() {
        view.printAllHashStudents(model.getAllHashMapStudents());        
    }

    
}
