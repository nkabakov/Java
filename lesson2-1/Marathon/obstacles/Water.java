package course2.HW.lesson1.Marathon.obstacles;

import course2.HW.lesson1.Marathon.competitors.Competitor;

public class Water extends Obstacle {
    int lenght;

    public Water(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(lenght);
    }
}
