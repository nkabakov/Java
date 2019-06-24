package course2.HW.lesson1.Marathon.obstacles;

import course2.HW.lesson1.Marathon.competitors.Competitor;

public class Cross extends Obstacle{
    int lenght;

    public Cross(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(lenght);
    }
}
