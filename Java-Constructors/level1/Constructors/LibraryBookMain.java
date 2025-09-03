public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Basics", "John Smith", 350);
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();
    }
}
