public class BinarySearch {
    public Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productName.equals(targetName)) {
                return products[mid];
            } else if (products[mid].productName.compareTo(targetName) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        Product[] products = new Product[] {
            new Product("1", "Apple", "Fruit"),
            new Product("2", "Banana", "Fruit"),
            new Product("3", "Cherry", "Fruit"),
            new Product("4", "Date", "Fruit"),
            new Product("5", "pineapple", "Fruit")
        };
        java.util.Arrays.sort(products, (a, b) -> a.productName.compareTo(b.productName));

        Product result = search.binarySearch(products, "Date");
        if (result != null) {
            System.out.println("Found product: " + result.productName);
        } else {
            System.out.println("Product not found");
        }
    }
}
