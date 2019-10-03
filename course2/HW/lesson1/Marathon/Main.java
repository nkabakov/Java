package course2.HW.lesson1.Marathon;

import course2.HW.lesson1.Marathon.competitors.Human;
import course2.HW.lesson1.Marathon.competitors.Team;
import course2.HW.lesson1.Marathon.obstacles.*;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Одуванчики", new Human("Андрей",180,50,1),
                new Human("Пётр",90,100,1),
            new Human("Алексей",200,0,2),
            new Human("Фома",120,20,3));

        Course course = new Course(new Cross(100),
                new Wall(2), new Water(20));

        course.go(team);
        team.showWinners();
    }
}
