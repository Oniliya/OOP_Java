package Classes;

import java.util.List;
import java.util.Scanner;

public class View {

    public List<Toy> new_list;

    private List<Toy> winners;

    public View(List<Toy> new_list) {
        this.new_list = new_list;
    }


    public void run() {
        Logger logger = new Logger();

        while (true)  {
            System.out.println("======================================================= \n" +
            " Меню розыгрыша игрушек в магазине детских товаров: \n" +
            "1. Показать общий список игрушек \n" +
            "2. Добавить новую игрушку в общий список \n" +
            "3. Изменить частоту выпадения игрушки \n" +
            "4. Организовать розыгрыш игрушек и показать результаты розыгрыша игрушек \n" +
            "5. Получить призовую игрушку (записать ее в файл)\n" +
            "6. Выход \n" +
            "======================================================= \n");
            String cmd = prompt("Выберите команду ");    
            switch (cmd) {
                case "1": /* "1. Показать общий список игрушек \n" */
                    System.out.println("******************   Общий списк игрушек   ****************** \n");
                    System.out.println(new_list.toString());
                    logger.writeToFile("Общий список игрушек в магазине -> " + new_list.toString());
                    continue;    

                case "2": /* "2. Добавить новую игрушку в общий список \n"*/
                    String new_name = prompt("Введите имя игрушки -> ");
                    Integer new_count = promptInt("Введите количество таких игрушек -> ");
                    Integer new_freq = promptInt("Введите частоту выпадения игрушки при розыгрыше (от 0 до 100) -> ");
                    Toy new_toy = new Toy(new_list.size(), new_name, new_count, new_freq);
                    new_list.add(new_toy);
                    System.out.println("******************   Новая игрушка добавлена \n");
                    continue;   

                case "3": /* "3. Изменить частоту выпадения игрушки \n"*/
                    Integer asked_freq_id = promptInt("Введите ID игрушки, которой необходимо изменить частоту выпадения -> ");
                    for (Toy toy : new_list) {
                        if (toy.getToy_id()==asked_freq_id) {
                            new_freq = promptInt("Введите частоту выпадения игрушки при розыгрыше (от 0 до 100) -> ");
                            toy.setToy_frequency(new_freq);
                            System.out.println("******************   Частота выпадения игрушки изменена \n");
                        }
                    }
                    continue;   

                case "4": /* "4. Организовать розыгрыш игрушек \n"*/
                    ToyList toy_list = new ToyList(new_list);
                    // System.out.println(toy_list.toString());
                    Integer count = promptInt("Введите количество игрушек для розыгрыша -> ");
                    logger.writeToFile("Состоялся розыгрыш игрушек. Результат розыгрыша -> ");
                    winners = toy_list.playGame(count);
                    System.out.println("------------------------------------------------------");
                    for (Toy t: winners) {
                        System.out.print(t.getName()+" , ");
                        logger.writeToFile(t.getName()+"  ");
                    }
                    System.out.println();
                    System.out.println("------------------------------------------------------");
                    logger.writeToFile("Оставшиеся в магазине игрушки -> " + new_list.toString());
                    continue; 
                                      
                case "5": /* "5. Получить призовую игрушку \n"*/
                    
                    if (winners.size() > 0) {
                        System.out.println("Вы взяли выигрышную игрушку " + winners.get(0).getName());
                        logger.writeToFile("Вы взяли выигрышную игрушку " + winners.get(0).getName());
                        winners.remove(0);
                    }
                    else {
                        System.out.println("выигрышный список игрушек пуст, организуйте выигрыш ");
                        logger.writeToFile("выигрышный список игрушек пуст, организуйте выигрыш ");
                        continue;
                    }
                    continue;     

            }       
            /* "6. Выход \n"*/         
            if (cmd.equals("6")) {
                String cmd1 = prompt("Продолжить работу (y/n)?");
                if (cmd1.equals("y")) {
                    continue;
                }
                break;
            }
       }
    }

    // ввод числа
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    // ввод команды
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
