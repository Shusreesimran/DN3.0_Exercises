import java.util.HashMap;

class Product {
    String productId;
    String productName;
    int quantity;
    double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagement {
    private HashMap<String, Product> products;

    public InventoryManagement() {
        this.products = new HashMap<>();
    }

    public void addProduct(String productId, String productName, int quantity, double price) {
        Product product = new Product(productId, productName, quantity, price);
        products.put(productId, product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            product.quantity = quantity;
            product.price = price;
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        inventory.addProduct("P1", "Product 1", 10, 9.99);
        inventory.addProduct("P2", "Product 2", 20, 19.99);

        System.out.println(inventory.getProduct("P1").productName);

        inventory.updateProduct("P1", 15, 10.99);
        System.out.println(inventory.getProduct("P1").quantity);

        inventory.deleteProduct("P2");
        System.out.println(inventory.getProduct("P2")); 
    }
}


