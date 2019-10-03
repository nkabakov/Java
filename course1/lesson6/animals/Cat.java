package lesson6.animals;

public class Cat extends lesson6.animals.Animal {

    int maxHeightJump = 200;
    int maxLenghtRun = 200;

    public Cat() {
        super();
        type = "Кот";
    }

    public Cat(String name) {
        super(name);
        type="Кот";
    }

    public Cat (String name, int age){
        super(name, age);
        type="Кот";

    }

    public int getMaxLenghtRun(int age) {
        if (age<=2){
            maxLenghtRun = age*100;
        } else if ((age>2)&&(age<=12)){
            maxLenghtRun = 200-((age-2)*20);
        } else {
            maxLenghtRun = 0;
        }
        return maxLenghtRun;
    }

    public int getMaxHeightJump (int age) {
        if (age<=2){
            maxHeightJump = age*100;
        } else if ((age>2)&&(age<=13)){
            maxHeightJump = 200-age*15;
        } else {
            maxHeightJump = 0;
        }
        return maxHeightJump;
    }


    @Override
    public boolean jumpOver(int height) {
        if (height<= maxHeightJump) {
            return true;
        } else return false;
    }

    @Override
    public boolean run(int lenght) {
        if (lenght<= maxLenghtRun){
            return true;
        } else return false;
    }

    @Override
    public boolean swim(int lenght) {
        return false;
    }
}
