package course2.lesson1.marathon;

import course2.lesson1.marathon.competitors.Cat;
import course2.lesson1.marathon.competitors.Competitor;
import course2.lesson1.marathon.competitors.Dog;
import course2.lesson1.marathon.competitors.Human;
import course2.lesson1.marathon.obstacles.Cross;
import course2.lesson1.marathon.obstacles.Obstacle;
import course2.lesson1.marathon.obstacles.Wall;
import course2.lesson1.marathon.obstacles.Water;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors={new Human("Bob"),
        new Cat("Vaska"), new Dog("Tuzik")};
        Obstacle[] obstacles = {new Cross(80), new Wall(2), new Water(10)};

        for (Competitor c:competitors) {
            for (Obstacle o:obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor c:competitors) {
            c.info();
        }

    }
}
