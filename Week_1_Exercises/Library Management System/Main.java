public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book(1, "Book 1", "Author 1");
        books[1] = new Book(2, "Book 2", "Author 2");
        books[2] = new Book(3, "Book 3", "Author 3");
        books[3] = new Book(4, "Book 4", "Author 4");
        books[4] = new Book(5, "Book 5", "Author 5");

        java.util.Arrays.sort(books, (b1, b2) -> b1.title.compareTo(b2.title));

        LibraryManagementSystem lms = new LibraryManagementSystem(books);

        Book book = lms.linearSearchByTitle("Book 3");
        if (book != null) {
            System.out.println( book.title + " by " + book.author +" found by linear search");
        } else {
            System.out.println("Book not found ");
        }

        book = lms.binarySearchByTitle("Book 3");
        if (book != null) {
            System.out.println( book.title + " by " + book.author +" found by binary search");
        } else {
            System.out.println("Book not found ");
        }
    }
}