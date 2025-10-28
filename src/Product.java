public class Product {
    private int id;
    private String name;
    private int price;
    private String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getCategory() {
        return this.category;
    }

    public String toString() {
        return "Товар [ артикул: " + id + ", название: " + name + ", цена: " + price + ", категория: " + category + ".]";
    }
}
