package lesson1HomeWork;



import java.util.ArrayList;
import java.util.List;

public class RobotMap {
    private int n;
    private int m;
    private final List<Robot> robots;
    private int robotCount;
    private final int MAX_ROBOTS = 1; // Maximum number of robots allowed on the map
    // Максимальное количество роботов, разрешенных на карте
    // конструктор

    public RobotMap(int n, int m) {
        this.n = 5;
        this.m = 5;
        this.robots = new ArrayList<>();
        this.robotCount = 0;
    }

    private void validatePoint(Point point) {
        validatePointIsCorrect(point);
        validatePointIsFree(point);
        validatorSizeMap();

    }

    private void validatorSizeMap() { // запрещает указывать отрицательные значения
        if (n <= 0 || m <= 0) {
            throw new IllegalStateException(" Координаты меньше или = 0");
        }

    }

    private void validatePointIsCorrect(Point point) {
        if (point.x() < 0 || point.x() > n || point.y() < 0 || point.y() > m) {
            throw new IllegalStateException(" Некоректное значения точки");
        }

    }

    public Robot createRobot(Point point) {
        validatePoint(point);
        validatePointIsFree(point);
        Robot robot = new Robot(point);
        robots.add(robot);
        if (robotCount >= MAX_ROBOTS) {
            throw new IllegalStateException("Превышено максимальное количество роботов на карте");
        }

        robots.add(robot);
        robotCount++;

        return robot;
    }

    private void validatePointIsFree(Point point) {
        for (Robot robot : robots) {
            if (robot.point.equals(point)) {
                throw new IllegalStateException(" Точка" + point + " занята");
            }
        }

    }

    // обьявляем класс внутри другоко Класса
    public class Robot {

        private Direction direction;
        private Point point;

        public Robot(Point point) {
            this.direction = Direction.TOP;
            this.point = point;
        }

        public void changeDirection(Direction direction) {
            this.direction = direction;
        }

        public void move() {
            move(1); // move one step by default
        }

        public void move(int steps) {
            for (int i = 0; i < steps; i++) {
                Point newPoint;

                switch (direction) {
                    case TOP:
                        newPoint = new Point(point.x() - 1, point.y());
                        break;
                    case RIGTH:
                        newPoint = new Point(point.x(), point.y() + 1);
                        break;
                    case BOTTOM:
                        newPoint = new Point(point.x() + 1, point.y());
                        break;
                    case LEFT:
                        newPoint = new Point(point.x(), point.y() - 1);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + direction);
                }
                validatePoint(newPoint);
                System.out.println("Робот переместился с " + point + " на " + newPoint);
                this.point = newPoint;

            }

        }

        @Override
        public String toString() {
            return point.toString() + ", dirction ' =" + direction.name();
        }

    }

}
