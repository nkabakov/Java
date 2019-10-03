package course2.HW.lesson1.Marathon.competitors;

public class Human implements Competitor {
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;
    boolean active;

    public Human(String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    @Override
    public void run(int dist) {

        if (dist <= maxRunDistance) {
            System.out.println(name + " пробежал дистанцию");
        } else {
            System.out.println(name + " упал посреди забега");
            active = false;
        }

    }

    @Override
    public void swim(int dist) {

        if (dist <= maxSwimDistance) {
            System.out.println(name + " проплыл дистанцию");
        } else {
            System.out.println(name + " не смог проплыть и утонул");
            active = false;
        }
    }

    @Override
    public void jump(int height) {

        if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул препятствие");
        } else {
            System.out.println(name + " остался стоять перед стеной");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " успешно завершил соревнование!");
    }
}
