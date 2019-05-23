package lesson5;

public class Person {

//    ФИО, должность, email, телефон, зарплата, возраст

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    public int age;

    public Person(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Person() {
        this.name = "Введите Имя";
        this.position = "Укажите должность";
        this.email = "Укажите email";
        this.phoneNumber = "Укажите номер телефона";
        this.salary = 0;
        this.age = 0;
    }

    public void info() {
        System.out.println("Имя: " + name + " Должность: " + position + " email: " + email + " Номер телефона: " + phoneNumber + " Зарплата: " + salary + " Возраст: " + age);
    }

}
