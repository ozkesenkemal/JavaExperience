public class Product {
    public Product() {
        //constructor
        System.out.println("Product constructor run");
    }

    public Product(int id, String name, String description, int price, int stockAmount) {
        //constructor overload
        System.out.println("Product constructor with param run");
        this.Id = id;
        this.Name = name;
        this.Description = description;
        this.Price = price;
        this.stockAmount = stockAmount;
    }

    private int Id;

    //getter
    public int getId() {
        return Id;
    }

    //setter
    public void setId(int id) {
        Id = id;
    }

    private String Name;
    private String Description;
    private double Price;
    private int stockAmount;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
