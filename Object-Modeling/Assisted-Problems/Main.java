public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        lib1.showBooks();
        lib2.showBooks();
    }
}