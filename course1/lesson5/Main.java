package course1.lesson5;

public class Main {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Andreev Andrey", "Engineer", "andrey2@mailbox.com", "892654215", 31000, 38);
        persArray[2] = new Person("Petrov Vasily", "Manager", "petrovmanager@mailbox.com", "895462141", 40000, 49);
        persArray[3] = new Person("Vodyanova Elizaveta", "HR", "elizabethHR@mailbox.com", "895641215", 32000, 55);
        persArray[4] = new Person("Kabakov Nikita", "Senior engineer", "nkabakov@mailbox.com", "8923797897", 130000, 40);
//      Если ввести сотрудника без параметров, то будут введены поля "Введите Имя", "Укажите должность" и т.п.
//      persArray[0] = new Person();

        for (int i = 0; i < 5; i++) {
            if (persArray[i].age > 40) {
                persArray[i].info();
            }
        }
    }
}
