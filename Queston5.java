class Book {
    int bookId;
    String title;
    double price;

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Java", 600),
            new Book(102, "Python", 450),
            new Book(103, "C++", 700),
            new Book(104, "OOP", 550),
            new Book(105, "DBMS", 400)
        };

        double total = 0;
        for (Book b : books) {
            total += b.price;
            if (b.price > 500) {
                System.out.println("Book ID: " + b.bookId + ", Title: " + b.title + ", Price: " + b.price);
            }
        }
        System.out.println("Average Price: " + (total / books.length));
    }
}
