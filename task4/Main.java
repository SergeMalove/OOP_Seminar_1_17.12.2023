package task4;

public class Main {
    public static void main(String[] args) {
        // Работаем с работником
        Employee employee = new EmployeeImpl();
        employee.work();
        employee.takeBreak();

        // Работаем с продуктом
        Product product = new ProductImpl(10.99, "Ноутбук");
        System.out.println("Цена продукта: $" + product.getPrice());
        product.setDescription("Планшет");
        System.out.println("Описание продукта: " + product.getDescription());
    }
}
