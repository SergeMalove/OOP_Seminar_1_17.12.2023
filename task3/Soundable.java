package task3;

// Интерфейс для определения метода звука
public interface Soundable {
    void makeSound();

    // Константа для определения общего звука
    String COMMON_SOUND = "Издаёт звук";

    // Дефолтный метод для вывода общего звука
    static void displayCommonSound() {
        System.out.println(COMMON_SOUND);
    }
}
