package lesson6.animals;

public class Dog extends Animal {

    int maxHeightJump = 50;
    int maxLenghtRun = 500;
    int maxLenghtSwim = 10;

    public Dog() {
        type = "Пёс";
    }

    public Dog(String name) {
        super(name);
        type = "Пёс";

    }

    public Dog(String name, int age) {
        super(name, age);
        type = "Пёс";
    }

    public int getMaxLenghtRun(int age) {
        if (age <= 2) {
            maxLenghtRun = age * 250;
        } else if ((age>2)&&(age<=16)){
            maxLenghtRun = 500 - age * 31;
        } else {
            maxLenghtRun = 0;
        }
        return maxLenghtRun;
    }

    public int getMaxHeightJump(int age) {
        if (age <= 2) {
            maxHeightJump = age * 25;
        } else if ((age>2)&&(age<=12)){
            maxHeightJump = 50 - ((age - 2)* 5);
        } else {
            maxHeightJump = 0;
        }
        return maxHeightJump;
    }

    public int getMaxLenghtSwim(int age) {
        if (age <= 1) {
            maxLenghtSwim = 10;
        } else if ((age>1)&&(age <=11)) {
            maxLenghtSwim = 10 - (age - 1);
        } else {
            maxLenghtSwim = 0;
        }
        return maxLenghtSwim;
    }

    @Override
    public boolean jumpOver(int height) {
        if (height <= maxHeightJump) {
            return true;
        } else return false;
    }

    @Override
    public boolean run(int lenght) {
        if (lenght <= maxLenghtRun) {
            return true;
        } else return false;
    }

    @Override
    public boolean swim(int lenght) {
        if (lenght <= maxLenghtSwim) {
            return true;
        } else return false;
    }
}
