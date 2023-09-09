package Domen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    /**
     * класс StudentSteam(поток студентов с полем номер потока) 
     * содержащий в себе список учебных групп(StudentGroup)
     */
    private List<StudentGroup> StudentGroup;
    private Integer idSteam;
    public HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
    /**
     * 
     * @param studentGroup список учебных групп
     * @param idSteam поле номер потока
     */
    public StudentSteam(List<StudentGroup> studentGroup, Integer idSteam) {
        this.StudentGroup = studentGroup;
        this.idSteam = idSteam;
    }    

    public Integer getIdSteam() {
        return idSteam;
    }


    public void setIdSteam(Integer idSteam) {
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getStudentGroup() {
        return StudentGroup;
    }

    public void setStudentGroup(List<StudentGroup> studentGroup) {
        StudentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "StudentSteam [StudentGroup=" + idSteam
            + ", idSteam=" + idSteam 
            + " -|- " 
            + StudentGroup.size() 
            + " -|- " 
            + StudentGroup.toString()
            + "]";
    }
    /**
     * добавлен итератор
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'iterator'");
        return new StudentSteamIterator(getStudentGroup());
    }
}
