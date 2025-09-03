public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("1984", "George Orwell", 299.99);

        b1.displayDetails();
        b2.displayDetails();
    }
}

