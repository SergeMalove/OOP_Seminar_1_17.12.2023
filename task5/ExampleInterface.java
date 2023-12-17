package task5;

// Интерфейс с статическим методом и дефолтным методом
public interface ExampleInterface {
    // Статический метод
    static void staticMethod() {
        System.out.println("Это статический метод интерфейса.");
    }

    // Дефолтный метод
    default void defaultMethod() {
        System.out.println("Это дефолтный метод интерфейса.");
    }

    // Абстрактный метод
    void abstractMethod();
}
