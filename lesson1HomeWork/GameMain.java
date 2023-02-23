package lesson1HomeWork;

// Карта с роботами.

// Карта имеет nxm, где n и m - положительные целые числа.
// Должна быть возможность создания робота на какой-то точке на карте.
// Точка на карте описывается двумя целочисленными координатами.
// Роботы могут перемещаться по карте вперед.
// В одной точке не может находиться несколько роботов.

// HOMEWORK
// 0. Разобраться с проектом. Подготовить вопросы к следующему семинару, если возникнут.
// 1. Добавить валидацию параметров при создании карты
// 2. Реализовать возможность задать ограничение по количеству создаваемых
// на карте роботов (в конструкторе карты)
// При этом если параметр не указан, то используем значение по-умолчанию: 5
// 3*. Реализовать возможность вызова метода move с параметром - количество шагов вперед
// Подсказка: можно несколько раз вызвать метод #move

/*
  * * * * *
  * * * * *
  * * * * *
  * * * * *
  * * * * *
*/

public class GameMain {
    public static void main(String[] args) {
        RobotMap map = new RobotMap(5, 5);// запретить указывать отрицательные значения

        RobotMap.Robot robot = map.createRobot(new Point(5, 3));
        // RobotMap.Robot robot1 = map.createRobot(new Point(4, 3));
        System.out.println(robot);
        robot.move(3);
        System.out.println(robot);
        // robot.changeDirection(Direction.BOTTOM);
        // robot.move();
        // robot.move();
        // robot.changeDirection(Direction.LEFT);
        // robot.move();
        // System.out.println(robot);

    }

}