public class Product {

    private String name;
    private double price;
    private boolean available;

    public Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setAvailable(boolean available) { this.available = available; }

    public void printProductInfo() {
        System.out.println(String.format(
                "Назва: %s, ціна: %.2f грн, наявність: %s",
                name,
                price,
                available ? "Є в наявності" : "Немає в наявності"
        ));
    }

    public static void demo() {
        Product phone  = new Product("Телефон", 10699.99, true);
        Product laptop = new Product("Ноутбук", 59500.00, false);

        phone.printProductInfo();
        laptop.printProductInfo();
    }
}