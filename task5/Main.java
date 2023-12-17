package task5;

// Главный класс
public class Main {
    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();

        // Вызываем статический метод через интерфейс
        ExampleInterface.staticMethod();

        // Вызываем дефолтный метод через экземпляр класса
        example.defaultMethod();

        // Вызываем абстрактный метод через экземпляр класса
        example.abstractMethod();
    }
}
