package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

// модель для работы с файлом, подключаем ее к вью implements iGetModel
public class ModelFile  implements iGetModel {
    private String fileName;
    private List<Student> students;

    /**
     * конструктор 
     * @param fileName само название файла
     */
    public ModelFile(String fileName) {
        this.fileName = fileName;
        // проверяем существование файла
        try(FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // получаем всех студентов из файла
    @Override
    public List<Student> getAllStudents() {
        List<Student> students  = new ArrayList<Student>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]), Integer.parseInt(param[2]));
                students.add(pers);
                line = reader.readLine();
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    // метод для сохранниея студентов в файл - дозаписать append-true
    public void saveAllStudentToFile(List<Student> students) {
        try(FileWriter fw = new FileWriter(fileName, false)) {
            for(Student pers : students) {
                fw.write(pers.getName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public HashMap<Long, Student> getAllHashMapStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllHashMapStudents'");
    }

    @Override
    public void setAllStudents(List<Student> students) {
        this.students = students;
    }
    
}
