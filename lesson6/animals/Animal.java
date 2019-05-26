package lesson6.animals;

public class Animal {
    protected String type;
    protected String name;
    protected int age;


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean jumpOver(int height) {
        System.out.println("Not enough info about physical abilities this kind of animal");
        return false;
    }

    public boolean run(int lenght) {
        System.out.println("Not enough info about physical abilities this kind of animal");
        return false;
    }

    public boolean swim(int lenght) {
        System.out.println("Not enough info about physical abilities this kind of animal");
        return false;
    }


    public void info() {
        System.out.println(type + " " + name);
    }

    public void printAge(){
        System.out.println(age);
    }

    public int getAge () {
        return age;
    }

}
