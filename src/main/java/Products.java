import java.util.HashMap;

public class Products {
    private int id;
    private String name;
    private double price;



    public Products(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   /* HashMap<String, Products> inventory;

        inventory.put(name, product);
    String[] parts = input.split("\\|");

    int id = Integer.parseInt(parts[0]);
    String name = parts[1];
    float price = Float.parseFloat(parts[2]);

    Products product = new Products(id, name, price);

        inventory.put(name, product);*/




}