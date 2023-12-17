package task3;

// Класс животного, реализующий интерфейсы Movable и Soundable
public class Animal implements Movable, Soundable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + " двигается.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " издает звук.");
    }
}
