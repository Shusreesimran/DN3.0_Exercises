public class LinearSearch {
    public Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equals(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        Product[] products = new Product[] {
            new Product("1", "Product 1", "Category 1"),
            new Product("2", "Product 2", "Category 2"),
            new Product("3", "Product 3", "Category 3")
        };

        Product result = search.linearSearch(products, "Product 2");

        if (result != null) {
            System.out.println("Found product: " + result.productName);
        } else {
            System.out.println("Product not found");
        }
    }
}
