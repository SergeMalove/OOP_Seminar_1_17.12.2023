package task4;

// Класс, представляющий продукт
public class ProductImpl implements Product {
    private double price;
    private String description;

    public ProductImpl(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
