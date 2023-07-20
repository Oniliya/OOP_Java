package Services;

import java.util.List;

public interface iPersonService<T> {
    /**
     * интерфейс (только перечисление методов)
     * @return
     */
    List<T> getAll();
    void create(String firstName, int age); 
}
