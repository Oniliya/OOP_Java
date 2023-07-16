import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);

        Student s11 = new Student("Иван1", 22, 1211);
        Student s21 = new Student("Игорь1", 13, 3011);
        Student s31 = new Student("Иван1", 21, 1211);
        Student s41 = new Student("Игорь1",  25, 4414);
        Student s51 = new Student("Даша1",  27, 1711);
        Student s61 = new Student("Лена1",  23, 1041);

        Student s12 = new Student("Иван2", 25, 1212);
        Student s22 = new Student("Игорь2", 23, 3021);
        Student s32 = new Student("Иван2", 22, 1212);
        Student s42 = new Student("Игорь2",  23, 4424);
        Student s52 = new Student("Даша2",  23, 1712);
        Student s62 = new Student("Лена2",  23, 1042);


        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);
        
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s11);
        listStud1.add(s21);
        listStud1.add(s31);
        listStud1.add(s41);
        listStud1.add(s51);
        // listStud1.add(s61);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s12);
        listStud2.add(s22);
        // listStud2.add(s32);
        // listStud2.add(s42);
        // listStud2.add(s52);
        // listStud2.add(s62);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        StudentGroup group4581 = new StudentGroup(listStud1, 4581);
        StudentGroup group4582 = new StudentGroup(listStud2, 4582);
        // System.out.println(group4580);

        // for(Student std : group4580){
        //     System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup()){
        //     System.out.println(std);
        // }

        List<StudentGroup> myList0 = new ArrayList<StudentGroup>();
        myList0.add(group4580);
        myList0.add(group4581);
        myList0.add(group4582);
        StudentSteam stream0 = new StudentSteam(myList0, 0);


        System.out.println("=========================================================");
       
        for(StudentGroup stGr : stream0){
            System.out.println(stGr);
        }        

        System.out.println("+++++++++++++++++ Отсортировано по количеству студентов в группах++++++++++++++++++++++++");
        Collections.sort(stream0.getStudentGroup());

        for(StudentGroup stGr : stream0){
            System.out.println(stGr);
        }


        







        System.out.println("-- переопределен toString -----------------------------------------------------");
        System.out.println(stream0);
    }
}
