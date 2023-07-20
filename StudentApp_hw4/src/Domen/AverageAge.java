package Domen;

import java.util.ArrayList;
import java.util.List;

public class AverageAge <T extends Person>{

    /**
     * @param myList
     * @return
     */
    public static<T> Double average(List<T> myList){
        Double res=0.0;
        for (int i = 0; i < myList.size(); i++) {
            res=res+((Person) myList.get(i)).getAge();            
        }
        return (double)res/myList.size();
    }
}
