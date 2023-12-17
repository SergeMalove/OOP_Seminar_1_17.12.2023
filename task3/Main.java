package task3;

// Главный класс
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Собака");
        dog.move();
        dog.makeSound();

        // Использование констант и дефолтных методов интерфейсов
        System.out.println("Максимальная скорость собаки: " + Movable.MAX_SPEED + " км/ч");
        dog.displayMaxSpeed();
        Soundable.displayCommonSound();
    }
}
