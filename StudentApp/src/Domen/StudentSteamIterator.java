package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> studSteam;
    /**
     * 
     * @param studSteam
     */

    public StudentSteamIterator(List<StudentGroup> studSteam) {
        this.studSteam = studSteam;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
        return counter < studSteam.size();
    }

    @Override
    public StudentGroup next() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'next'");
        if (!hasNext()){
            return null;
        }
        return studSteam.get(counter++);
    }
    
}

// HashMap