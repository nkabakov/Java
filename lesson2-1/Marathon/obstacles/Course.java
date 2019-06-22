package course2.HW.lesson1.Marathon.obstacles;

import course2.HW.lesson1.Marathon.competitors.Competitor;
import course2.HW.lesson1.Marathon.competitors.Team;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void go(Team team) {
        for (Competitor c : team.getCompetitors()) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
