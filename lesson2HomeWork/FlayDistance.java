package lesson2HomeWork;

public class FlayDistance {

    private final int distance;

    public FlayDistance(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanFly canFly) {
        return canFly.getFly() >= distance;
    }
}
