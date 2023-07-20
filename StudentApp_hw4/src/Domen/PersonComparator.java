package Domen;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {
    /**
     * компаратор для сравнения персон и его потомков
     * всегда возвращает -1 0 1
     * имя студента 
     * если одинаковые имена, то сравниваем возраст
     */
    @Override
    public int compare(T o1, T o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res == 0) {
            if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            return res;
        }
    }
}
