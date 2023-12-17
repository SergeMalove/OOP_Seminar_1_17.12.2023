package task3;

// Интерфейс для определения метода движения
public interface Movable {
    void move();

    // Константа для определения максимальной скорости движения
    double MAX_SPEED = 100.0;

    // Дефолтный метод для вывода максимальной скорости
    default void displayMaxSpeed() {
        System.out.println("Максимальная скорость: " + MAX_SPEED + " км/ч");
    }
}
