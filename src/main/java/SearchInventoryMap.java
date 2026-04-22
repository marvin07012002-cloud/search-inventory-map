import javax.xml.namespace.QName;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SearchInventoryMap {

    public static HashMap<String, Products> inventory = new HashMap<>();

    public static void main(String[] args) {

        loadInventory();
        Scanner scanner = new Scanner(System.in);




        System.out.println("Enter a product name: ");
        String searchName = scanner.nextLine();

        Products foundProduct = inventory.get(searchName);

        if (foundProduct != null) {
            System.out.printf("%d %s $%.2f%n", foundProduct.getId(), foundProduct.getName(), foundProduct.getPrice());
        } else {
            System.err.println("Product no found.");

        }
        scanner.close();

    }

    public static void loadInventory() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/" + "inventory.csv"));
            String input;

            while((input = reader.readLine())!=null){
                String[] parts = input.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);

                Products product = new Products (id,name,price);

                inventory.put(name,product);
            }
            reader.close();

        }catch (IOException e) {
            System.err.println("Error Reading the inventory file for reason.");
        }
    }
}