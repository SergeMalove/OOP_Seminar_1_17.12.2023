package task4;

public class Engineer implements Employee {
    @Override
    public void work() {
        System.out.println("Инженер работает");
    }

    @Override
    public void takeBreak() {
        System.out.println("У инженера перерыв с 13 до 14");
    }
}
