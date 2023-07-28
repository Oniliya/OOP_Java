// Проект Observer: Добавить нового наблюдателя (сейчас два
// наблюдателя Master и Student), организовать наблюдение за
// объектом Company.

public class Main {

    // Добавить нового наблюдателя, например Specialist, который будет наблюдать за Company
    public static void main(String[] args) {
        // создаем экземпляр менеджера
        iPublisher jobAgency = new JobAgency();
        
        // создаем клиентов - компании, подключаем к ним менеджера 
        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);
        
        // создаем наблюдателей
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("sidorov");
        
        // "подписываются" на данные сгенерерованные компаниями
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);

        for(int i = 0; i< 10; i++){
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }
    }
}
