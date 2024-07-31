public class Main {
    public static void main(String[] args) {
        Order[] orders = new Order[] {
            new Order(1, "John", 100.0),
            new Order(2, "Alice", 50.0),
            new Order(3, "Bob", 200.0),
            new Order(4, "Charlie", 150.0)
        };

        System.out.println("Before sorting:");
        printOrders(orders);

        BubbleSort.sortOrders(orders);

        System.out.println("After Bubble Sort:");
        printOrders(orders);

        QuickSort.sortOrders(orders);

        System.out.println("After Quick Sort:");
        printOrders(orders);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order.orderId + " " + order.customerName + " " + order.totalPrice);
        }
    }
}
