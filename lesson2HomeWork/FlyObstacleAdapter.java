package lesson2HomeWork;

public class FlyObstacleAdapter implements Obstacle{
    private final FlayDistance flayDistance;

    public FlyObstacleAdapter(FlayDistance flayDistance) {
        this.flayDistance = flayDistance;
    }
    @Override
    public boolean pass(Participant participant) {
        return flayDistance.pass(participant);
    }
    
}
