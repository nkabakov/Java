package course2.lesson1.marathon.obstacles;

import course2.lesson1.marathon.competitors.Competitor;

public class Cross extends Obstacle{
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
