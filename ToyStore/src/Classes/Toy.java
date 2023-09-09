package Classes;

public class Toy {
    
    private Integer toy_id;
    private String name;
    private Integer toy_count;
    private Integer toy_frequency;

    /***
     * конструктор создания игрушки одного наименования
     * @param toy_id ИД игрушки
     * @param name название ирушки
     * @param toy_count количество таких игрушек
     * @param toy_frequency частота встречи такой игрушки
     */
    public Toy(Integer toy_id, String name, Integer toy_count, Integer toy_frequency) {
        this.toy_id = toy_id;
        this.name = name;
        this.toy_count = toy_count;
        this.toy_frequency = toy_frequency;
    }

    public Integer getToy_id() {
        return toy_id;
    }

    public void setToy_id(Integer toy_id) {
        this.toy_id = toy_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getToy_count() {
        return toy_count;
    }

    public void setToy_count(Integer toy_count) {
        this.toy_count = toy_count;
    }

    public Integer getToy_frequency() {
        return toy_frequency;
    }

    public void setToy_frequency(Integer toy_frequency) {
        this.toy_frequency = toy_frequency;
    }

    @Override
    public String toString() {
        return "Toy [id=" + toy_id + ", name=" + name + ", count=" + toy_count + ", frequency=" + toy_frequency + "] \n";
    }


}
