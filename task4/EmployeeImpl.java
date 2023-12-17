package task4;

// Класс, представляющий работника
public class EmployeeImpl implements Employee {
    @Override
    public void work() {
        System.out.println("Работник работает.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Работник отдыхает.");
    }
}
